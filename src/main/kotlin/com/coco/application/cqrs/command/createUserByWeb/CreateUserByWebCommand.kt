package com.coco.application.cqrs.command.createUserByWeb

import com.coco.application.cqrs.command.base.Command
import io.smallrye.mutiny.Uni
import jakarta.ws.rs.core.Response

/**
@author Yu-Jing
@create 2024-08-14-下午 07:56
 */
data class CreateUserByWebCommand(
    var name: String,
    var email: String,
    var password: String
): Command<Uni<Response?>>