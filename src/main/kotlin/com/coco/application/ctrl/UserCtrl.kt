package com.coco.application.ctrl

import com.coco.application.cqrs.DefaultActionExecutor
import com.coco.application.cqrs.command.createUserByWeb.CreateUserByWebCommand
import com.coco.application.cqrs.command.login.LoginCommand
import com.coco.application.cqrs.command.logout.LogoutCommand
import com.coco.application.middleware.auth.JwtRequest
import com.coco.application.middleware.auth.Logged
import io.smallrye.mutiny.Uni
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response

/**
@author Yu-Jing
@create 2024-08-14-下午 05:46
 */
@Path("/user")
class UserCtrl @Inject constructor(
    private val executor: DefaultActionExecutor,
    private val jwt: JwtRequest,
) {

    @POST
    @Path("/login")
    fun login(command: LoginCommand): Uni<Response?> {
        return executor.validateCommand(command)
            .chain { _ -> executor.executeCommand(command) }
    }

    @POST
    @Path("/create")
    fun createUserByWeb(command: CreateUserByWebCommand): Uni<Response?> {
        return executor.validateCommand(command)
            .chain { _  -> executor.executeCommand(command) }
    }

    @Logged
    @GET
    @Path("/logout")
    fun logout(): Uni<Response?> {
        val command = LogoutCommand(jwt)
        return executor.executeCommand(command)
    }
}