package com.coco.application.cqrs.query.verifyToken

import com.coco.application.cqrs.query.base.QueryHandler
import com.coco.application.cqrs.query.base.QueryValidateResult
import com.coco.application.service.JwtManagementService
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-15-下午 01:52
 */

@ApplicationScoped
class VerifyTokenHandler @Inject constructor(
   private val jwtManagementService: JwtManagementService
): QueryHandler<Uni<VerifyTokenResult?>, VerifyTokenQuery> {

    override fun handle(query: VerifyTokenQuery, validateResult: QueryValidateResult?): Uni<VerifyTokenResult?> {
        val token = query.token
        val payloadMap = jwtManagementService.getPayload(token)
        val result = VerifyTokenResult(
            id = payloadMap?.get("id") as String,
            email = payloadMap?.get("email") as String,
            name = payloadMap?.get("name") as String
        )
        return Uni.createFrom().item(result)
    }
}
