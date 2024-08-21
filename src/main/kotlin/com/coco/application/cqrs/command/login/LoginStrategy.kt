package com.coco.application.cqrs.command.login

import io.smallrye.mutiny.Uni

/**
@author Yu-Jing
@create 2024-08-14-下午 03:39
 */
interface LoginStrategy {
    fun login(command: LoginCommand): Uni<String?>
}