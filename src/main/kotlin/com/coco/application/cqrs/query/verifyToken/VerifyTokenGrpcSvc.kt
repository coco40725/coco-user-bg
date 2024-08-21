package com.coco.application.cqrs.query.verifyToken

import com.coco.application.service.JwtManagementService
import com.cocodev.grpc.verifyToken.VerifyTokenRequest
import com.cocodev.grpc.verifyToken.VerifyTokenResponse
import com.cocodev.grpc.verifyToken.VerifyTokenSvc
import io.quarkus.grpc.GrpcService
import io.smallrye.mutiny.Uni
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-20-上午 11:23
 */

@GrpcService
class VerifyTokenGrpcSvc @Inject constructor(
    private val jwtManagementService: JwtManagementService
): VerifyTokenSvc {
    override fun verifyToken(request: VerifyTokenRequest): Uni<VerifyTokenResponse> {
        val token = request.token
        val payloadMap = jwtManagementService.getPayload(token)
        val result = VerifyTokenResult(
            id = payloadMap?.get("id") as String,
            email = payloadMap?.get("email") as String,
            name = payloadMap?.get("name") as String
        )
        return Uni.createFrom().item(
            VerifyTokenResponse.newBuilder()
                .setId(result.id)
                .setEmail(result.email)
                .setName(result.name)
                .build()
        )
    }
}