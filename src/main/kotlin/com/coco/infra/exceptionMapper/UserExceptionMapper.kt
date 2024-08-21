package com.coco.infra.exceptionMapper

import com.coco.infra.repo.exception.UserInsertException
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.core.Response
import org.jboss.resteasy.reactive.server.ServerExceptionMapper

/**
@author Yu-Jing
@create 2024-08-11-下午 05:25
 */
@ApplicationScoped
class UserExceptionMapper {
    @ServerExceptionMapper(UserInsertException::class)
    fun handleUserInsertException(exception: UserInsertException): Response {
        return Response
            .status(500)
            .entity(exception.message)
            .build()
    }
}