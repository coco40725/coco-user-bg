package com.coco.infra.repo

import com.coco.domain.enums.ProviderType
import com.coco.domain.model.User
import com.coco.infra.repo.exception.UserInsertException
import com.mongodb.ReadPreference
import com.mongodb.client.model.Filters
import com.mongodb.client.model.IndexOptions
import com.mongodb.client.model.Indexes
import io.quarkus.mongodb.reactive.ReactiveMongoClient
import io.smallrye.mutiny.Uni
import jakarta.annotation.PostConstruct
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.bson.Document

/**
@author Yu-Jing
@create 2024-08-14-下午 03:23
 */

@ApplicationScoped
class UserRepo @Inject constructor(
    private val mongoClient: ReactiveMongoClient,
){

    private val readCol = mongoClient
        .getDatabase("user-db")
        .getCollection("User")
        .withReadPreference(ReadPreference.primary())

    private val writeCol = mongoClient
        .getDatabase("user-db")
        .getCollection("User")

    private val emailIndex = IndexOptions().name("email")
        .unique(true)
        .background(true)

    @PostConstruct
    fun init(){
        readCol.createIndex(Indexes.ascending("email"), emailIndex).subscribe().with { _ -> }
    }

    private fun toDocument(user: User?): Document? {
        if (user == null) return null

        // if null then not add to map
        val mapData = mutableMapOf<String, Any?>()
        user.id?.let { mapData["_id"] = it }
        user.name?.let { mapData["name"] = it }
        user.email?.let { mapData["email"] = it }
        user.password?.let { mapData["password"] = it }
        user.provider?.let { mapData["provider"] = it }
        user.createDate?.let { mapData["createDate"] = it }
        user.enabled?.let { mapData["enabled"] = it }

        return Document(mapData)
    }

    private fun toObject(document: Document?): User? {
        if (document == null) return null
        return User(
            id = document.getString("_id"),
            name = document.getString("name"),
            email = document.getString("email"),
            password = document.getString("password"),
            provider = ProviderType.valueOf(document.getString("provider")),
            createDate = document.getDate("createDate"),
            enabled = document.getBoolean("enabled")
        )
    }

    fun insertOne(user: User): Uni<User> {
        val document = toDocument(user)
        return writeCol.insertOne(document).map { it ->
            if (it.wasAcknowledged()) {
                user
            } else {
                throw UserInsertException("Insert user failed")
            }
        }
    }

    fun findOneByEnableEmail(email: String): Uni<User?> {
        return readCol.find(Filters.and(
            Filters.eq("email", email),
            Filters.eq("enabled", true)
        )).collect().first().map { toObject(it) }
    }

}