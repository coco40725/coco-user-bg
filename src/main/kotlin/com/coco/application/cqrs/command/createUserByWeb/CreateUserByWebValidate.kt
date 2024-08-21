package com.coco.application.cqrs.command.createUserByWeb

import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.cqrs.command.base.CommandValidator
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-14-下午 08:25
 */
@ApplicationScoped
class CreateUserByWebValidate @Inject constructor(

): CommandValidator<CreateUserByWebCommand> {
    override fun validateCommand(command: CreateUserByWebCommand): Uni<CommandValidateResult> {
        var isValid = true
        val message = mutableListOf<String>()

        val name = command.name
        if (name.isEmpty()) {
            isValid = false
            message.add("name must not be empty")
        }

        val email = command.email
        if (email.isEmpty()) {
            isValid = false
            message.add("email must not be empty")
        }

        val password = command.password
        if (password.isEmpty()) {
            isValid = false
            message.add("password must not be empty")
        }

        return Uni.createFrom().item(CommandValidateResult(isValid, message))
    }
}