package com.coco.application.cqrs.command.logout

import com.coco.application.cqrs.command.base.Command
import com.coco.application.middleware.auth.JwtRequest
import io.smallrye.mutiny.Uni
import jakarta.ws.rs.core.Response

/**
@author Yu-Jing
@create 2024-08-21-上午 09:29
 */
data class LogoutCommand(
    var jwt: JwtRequest? = null
): Command<Uni<Response?>>
