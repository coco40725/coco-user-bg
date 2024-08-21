package com.coco.application.middleware.auth

import jakarta.annotation.Priority
import jakarta.inject.Inject
import jakarta.ws.rs.Priorities
import jakarta.ws.rs.container.ContainerRequestContext
import jakarta.ws.rs.container.ContainerRequestFilter
import jakarta.ws.rs.ext.Provider

/**
@author Yu-Jing
@create 2024-08-21-上午 10:02
 */

@Logged
@Provider
@Priority(Priorities.AUTHORIZATION)
class JwtRequestFilter: ContainerRequestFilter {
    @Inject
    lateinit var jr: JwtRequest

    override fun filter(requestContext: ContainerRequestContext) {
        val token = requestContext.cookies["coco-token"]?.value
        jr.init(mapOf("token" to token))
    }
}