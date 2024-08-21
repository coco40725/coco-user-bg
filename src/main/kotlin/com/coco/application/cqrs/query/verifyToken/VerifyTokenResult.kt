package com.coco.application.cqrs.query.verifyToken

/**
@author Yu-Jing
@create 2024-08-15-下午 01:55
 */
data class VerifyTokenResult(
    var id: String? = null,
    var name: String? = null,
    var email: String? = null,
) {
}