package com.coco.infra.exceptionMapper

import com.coco.application.service.excpetion.VerifyTokenException
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.core.Response
import org.jboss.resteasy.reactive.server.ServerExceptionMapper

/**
@author Yu-Jing
@create 2024-08-15-下午 03:47
 */

@ApplicationScoped
class TokenExceptionMapper {

    @ServerExceptionMapper(VerifyTokenException::class)
    fun handleVerifyTokenException(exception: VerifyTokenException): Response {
        return Response
            .status(500)
            .entity(exception.message)
            .build()
    }
}