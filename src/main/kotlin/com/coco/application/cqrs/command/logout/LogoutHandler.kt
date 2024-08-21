package com.coco.application.cqrs.command.logout

import com.coco.application.cqrs.command.base.CommandHandler
import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.service.JwtManagementService
import com.coco.application.service.excpetion.VerifyTokenException
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.core.NewCookie
import jakarta.ws.rs.core.Response


/**
@author Yu-Jing
@create 2024-08-21-上午 09:36
*/
@ApplicationScoped
class LogoutHandler @Inject constructor(
): CommandHandler<Uni<Response?>, LogoutCommand>{
    override fun handle(command: LogoutCommand, validateResult: CommandValidateResult?): Uni<Response?> {
        val cookie = NewCookie.Builder("coco-token")
            .path("/")
            .domain("coco-dev.com")
            .maxAge(0)
            .httpOnly(true)
            .build()            // remove cookie coco-token
        val resp = Response.ok()
            .cookie(cookie)
            .build()
        return Uni.createFrom().item(resp)
    }
}