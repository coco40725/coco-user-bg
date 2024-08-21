package com.coco.application.cqrs.query.verifyToken

import com.coco.application.cqrs.query.base.Query
import io.smallrye.mutiny.Uni

/**
@author Yu-Jing
@create 2024-08-15-下午 01:52
 */
data class VerifyTokenQuery(
    var token: String
): Query<Uni<VerifyTokenResult?>>
