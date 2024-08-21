package com.coco.application.service

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.coco.application.service.excpetion.VerifyTokenException
import com.coco.infra.config.JwtConfig
import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

/**
@author Yu-Jing
@create 2024-08-14-下午 04:45
 */

@ApplicationScoped
class JwtManagementService @Inject constructor(
    private val jwtConfig: JwtConfig
){

    private val secretKey = jwtConfig.secretKey()
    private val issuer = jwtConfig.issuer()
    private val expireSecs = jwtConfig.expireSecs()
    private val decoder64 = Base64.getUrlDecoder()
    private val mapper = ObjectMapper()

    fun generateJwtToken(payload: String): String {
        val algorithm = Algorithm.HMAC256(secretKey)
        return JWT.create()
            .withIssuer(issuer)
            .withPayload(payload)
            .withExpiresAt(Date(System.currentTimeMillis() + expireSecs * 1000))
            .sign(algorithm)
    }

    fun verifyJwtToken(token: String): Boolean {
        val algorithm = Algorithm.HMAC256(secretKey)
        val verifier = JWT.require(algorithm)
            .withIssuer(issuer)
            .build()

        return try {
            verifier.verify(token)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun getPayload(token: String): HashMap<*, *>? {
        val isValid = verifyJwtToken(token)
        if (!isValid) {
            throw VerifyTokenException("token is invalid")
        } else {
            val payloadPart = JWT.decode(token).payload
            val payload = decoder64.decode(payloadPart)
            return mapper.readValue(payload, HashMap::class.java)
        }

    }
}