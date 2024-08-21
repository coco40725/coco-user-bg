package com.coco.application.cqrs.command.createUserByWeb

import com.coco.application.cqrs.command.base.CommandHandler
import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.service.JwtManagementService
import com.coco.application.service.UserManagementService
import com.coco.domain.enums.ProviderType
import com.coco.domain.model.User
import com.fasterxml.jackson.databind.ObjectMapper
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.core.NewCookie
import jakarta.ws.rs.core.Response
import java.util.*

/**
@author Yu-Jing
@create 2024-08-14-下午 07:58
 */
@ApplicationScoped
class CreateUserByWebHandler @Inject constructor(
    private val userManagementService: UserManagementService,
    private val jwtManagementService: JwtManagementService
): CommandHandler<Uni<Response?>, CreateUserByWebCommand> {
    private val mapper = ObjectMapper()

    override fun handle(command: CreateUserByWebCommand, validateResult: CommandValidateResult?): Uni<Response?> {
        val hashPassword = userManagementService.hashPassword(command.password)
        val user = User(
            id = UUID.randomUUID().toString(),
            name = command.name,
            email = command.email,
            password = hashPassword,
            provider = ProviderType.WEB,
            createDate = Date(),
            enabled = true
        )
        return userManagementService.createUser(user).map { u ->
            val json = mapper.writeValueAsString(
                mapOf("email" to u.email, "name" to u.name)
            )
            val token = jwtManagementService.generateJwtToken(json)
            val cookie = NewCookie.Builder("coco-token")
                .path("/")
                .value(token)
                .build()
            Response.ok(token)
                .cookie(cookie)
                .build()
        }
    }
}