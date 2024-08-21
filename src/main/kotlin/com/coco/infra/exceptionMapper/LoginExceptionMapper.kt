package com.coco.infra.exceptionMapper

import com.coco.application.cqrs.command.login.UserNotFoundException
import com.coco.application.cqrs.query.base.NoSuchQueryException
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.core.Response
import org.jboss.resteasy.reactive.server.ServerExceptionMapper

/**
@author Yu-Jing
@create 2024-08-14-下午 07:55
 */
@ApplicationScoped
class LoginExceptionMapper {

    @ServerExceptionMapper( UserNotFoundException::class)
    fun handleUserNotFoundException(exception:  UserNotFoundException): Response {
        return Response
            .status(500)
            .entity(exception.message)
            .build()
    }
}