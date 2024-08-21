package com.coco.application.ctrl

import com.coco.application.cqrs.DefaultActionExecutor
import com.coco.application.cqrs.query.verifyToken.VerifyTokenQuery
import com.coco.application.cqrs.query.verifyToken.VerifyTokenResult
import com.cocodev.grpc.verifyToken.VerifyTokenRequest
import com.cocodev.grpc.verifyToken.VerifyTokenResponse
import com.cocodev.grpc.verifyToken.VerifyTokenSvc
import io.quarkus.example.Greeter
import io.quarkus.example.HelloReply
import io.quarkus.example.HelloRequest
import io.quarkus.grpc.GrpcClient
import io.quarkus.grpc.GrpcService
import io.smallrye.mutiny.Uni
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.QueryParam


/**
@author Yu-Jing
@create 2024-08-15-下午 01:46
 */
@Path("/jwt")
class JwtCtrl @Inject constructor(
    private val executor: DefaultActionExecutor,

){

    lateinit var hello: Greeter
    lateinit var verifyTokenGrpc: VerifyTokenSvc

    @GET
    @Path("/{name}")
    fun hello(name: String?): Uni<String> {
        return hello.sayHello(HelloRequest.newBuilder().setName(name).build())
            .onItem().transform { helloReply: HelloReply -> helloReply.message }
    }


    @Path("/verify")
    @GET
    fun verifyToken(@QueryParam("token") token: String): Uni<VerifyTokenResult?> {
        val query = VerifyTokenQuery(token)
        return executor.executeQuery(query)
    }

    @Path("/verify-grpc")
    @GET
    fun verifyTokenGrpc(@QueryParam("token") token: String): Uni<VerifyTokenResponse?> {
        val request = VerifyTokenRequest.newBuilder().setToken(token).build()
        return verifyTokenGrpc.verifyToken(request)
    }

}