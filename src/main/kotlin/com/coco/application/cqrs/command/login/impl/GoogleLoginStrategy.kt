package com.coco.application.cqrs.command.login.impl

import com.coco.application.cqrs.command.login.LoginCommand
import com.coco.application.cqrs.command.login.LoginStrategy
import com.coco.application.service.JwtManagementService
import com.coco.application.service.UserManagementService
import com.coco.domain.enums.ProviderType
import com.coco.domain.model.User
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*


/**
@author Yu-Jing
@create 2024-08-14-下午 03:41
 */

@ApplicationScoped
class GoogleLoginStrategy @Inject constructor(
    private val jwtManagementService: JwtManagementService,
    private val userManagementService: UserManagementService
): LoginStrategy {

    private val mapper = ObjectMapper()
    override fun login(command: LoginCommand): Uni<String?> {
        val idToken = command.idToken
        val transport = GoogleNetHttpTransport.newTrustedTransport()
        val jsonFactory = GsonFactory.getDefaultInstance()
        val googleTokenVerify = GoogleIdTokenVerifier.Builder(transport, jsonFactory).build()
        return try {
            val token = googleTokenVerify.verify(idToken)
            if (!checkGoogleTokenValid(token)) {
                throw Exception("Google token is invalid")
            }
            val payload = token.payload
            val email = payload.email
            val name = payload["name"] as String
            userManagementService.findUser(email)
                .chain { u ->
                    if (u == null) {
                        val now = Date()
                        val user = User(
                            id = UUID.randomUUID().toString(),
                            email = email,
                            name = name,
                            password = null,
                            provider = ProviderType.GOOGLE,
                            createDate = now,
                            enabled = true)
                        userManagementService.createUser(user)
                } else {
                    Uni.createFrom().item(u)
                }
            }.map { u ->
                val json = mapper.writeValueAsString(
                    mapOf("id" to u.id, "email" to u.email, "name" to u.name)
                )
                jwtManagementService.generateJwtToken(json)
            }

        } catch (e: Exception) {
            Uni.createFrom().failure(e)
        }
    }

    private fun checkGoogleTokenValid(token: GoogleIdToken): Boolean {
        var isValid = true
        val payload = token.payload
        val emailVerify = payload.emailVerified
        val expire = payload.expirationTimeSeconds * 1000
        if (!emailVerify) {
            isValid = false
        }
        if (expire < System.currentTimeMillis()) {
            isValid = false
        }
       return isValid
    }
}