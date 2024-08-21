package com.coco.application.cqrs.command.login.impl

import com.coco.application.cqrs.command.login.LoginCommand
import com.coco.application.cqrs.command.login.LoginStrategy
import com.coco.application.cqrs.command.login.UserNotFoundException
import com.coco.application.service.JwtManagementService
import com.coco.application.service.UserManagementService
import com.fasterxml.jackson.databind.ObjectMapper
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-14-下午 03:53
 */

@ApplicationScoped
class WebLoginStrategy @Inject constructor(
    private val jwtManagementService: JwtManagementService,
    private val userManagementService: UserManagementService
): LoginStrategy {

    private val mapper = ObjectMapper()
    override fun login(command: LoginCommand): Uni<String?> {
        val email = command.email
        val password = command.password

        return userManagementService.findUser(email !!).map { u ->
            if (u == null || !userManagementService.verifyPassword(password !!, u.password !!)) {
                throw UserNotFoundException("User not found or password is incorrect")
            } else {
                val json = mapper.writeValueAsString(
                    mapOf("id" to u.id, "email" to u.email, "name" to u.name)
                )
                jwtManagementService.generateJwtToken(json)
            }
        }
    }
}