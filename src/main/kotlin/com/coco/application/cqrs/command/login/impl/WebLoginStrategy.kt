package com.coco.application.cqrs.command.login.impl

import com.coco.application.cqrs.command.login.LoginCommand
import com.coco.application.cqrs.command.login.LoginStrategy
import com.coco.application.exception.ApplicationException
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

    private val className = this::class.java.simpleName
    private val mapper = ObjectMapper()
    override fun login(command: LoginCommand): Uni<String?> {
        val email = command.email
        val password = command.password

        return userManagementService.findUser(email !!).chain { u ->
            if (u == null || !userManagementService.verifyPassword(password !!, u.password !!)) {
                Uni.createFrom().failure(ApplicationException(
                    className,
                    this::login.name,
                    "User not found or password is incorrect"
                ))
            } else {
                val json = mapper.writeValueAsString(
                    mapOf("id" to u.id, "email" to u.email, "name" to u.name)
                )
                Uni.createFrom().item(jwtManagementService.generateJwtToken(json))
            }
        }
    }
}