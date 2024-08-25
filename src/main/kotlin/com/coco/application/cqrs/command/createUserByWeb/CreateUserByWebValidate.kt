package com.coco.application.cqrs.command.createUserByWeb

import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.cqrs.command.base.CommandValidator
import com.coco.application.exception.CommandValidationException
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
    private val className = CreateUserByWebValidate::class.java.simpleName
    override fun validateCommand(command: CreateUserByWebCommand): Uni<CommandValidateResult> {

        val name = command.name
        if (name.isEmpty()) {
            return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.NAME_INVALID.name))
        }

        val email = command.email
        if (email.isEmpty()) {
            return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.EMAIL_INVALID.name))
        }

        val password = command.password
        if (password.isEmpty()) {
            return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.PASSWORD_INVALID.name))
        }

        return Uni.createFrom().item(CommandValidateResult())
    }
}

enum class ValidateMessage {
    NAME_INVALID,
    EMAIL_INVALID,
    PASSWORD_INVALID
}