package com.coco.application.cqrs.command.login

import com.coco.application.cqrs.command.base.CommandHandler
import com.coco.application.cqrs.command.base.CommandValidateResult
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.core.NewCookie
import jakarta.ws.rs.core.Response

/**
@author Yu-Jing
@create 2024-08-14-下午 03:40
 */
@ApplicationScoped
class LoginHandler @Inject constructor(
    private val loginFactory: LoginFactory
): CommandHandler<Uni<Response?>, LoginCommand> {
    override fun handle(command: LoginCommand, validateResult: CommandValidateResult?): Uni<Response?> {
        val type = command.providerType
        val loginStrategy = loginFactory.getLoginStrategy(type)
        return loginStrategy.login(command).map {
            if (it != null) {
                val cookie = NewCookie.Builder("coco-token")
                    .path("/")
                    .domain("coco-dev.com")
                    .value(it)
                    .build()
                Response.ok(it)
                    .cookie(cookie)
                    .build()
            } else {
                null
            }
        }
    }
}