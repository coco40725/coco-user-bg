package com.coco.infra.grpc

import io.quarkus.example.Greeter
import io.quarkus.example.HelloReply
import io.quarkus.example.HelloRequest
import io.quarkus.grpc.GrpcService
import io.smallrye.mutiny.Uni

/**
@author Yu-Jing
@create 2024-08-19-下午 04:37
 */

@GrpcService
class HelloSvc : Greeter {
    override fun sayHello(request: HelloRequest?): Uni<HelloReply> {
        return Uni.createFrom().item {
            HelloReply.newBuilder().setMessage(" I got you!! Hello " + request!!.name).build()
        }
    }
}