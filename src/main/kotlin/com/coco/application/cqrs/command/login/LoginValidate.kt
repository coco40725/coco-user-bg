package com.coco.application.cqrs.command.login

import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.cqrs.command.base.CommandValidator
import com.coco.application.exception.CommandValidationException
import com.coco.domain.enums.ProviderType
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped

/**
@author Yu-Jing
@create 2024-08-14-下午 08:00
 */

@ApplicationScoped
class LoginValidate: CommandValidator<LoginCommand> {

    private val className = LoginValidate::class.java.simpleName
    override fun validateCommand(command: LoginCommand): Uni<CommandValidateResult> {
        var isValid = true
        val message = mutableListOf<String>()
        val type = command.providerType

        // rule 1: if LoginType is WEB, then email and password must not be null
        if (type == ProviderType.WEB) {
            if (command.email.isNullOrEmpty()) {
                return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.EMAIL_INVALID.name))
            }
            if (command.password.isNullOrEmpty()) {
               return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.PASSWORD_INVALID.name))
            }
        }

        // rule 2: if LoginType is GOOGLE, then idToken must not be null
        if (type == ProviderType.GOOGLE) {
            if (command.idToken.isNullOrEmpty()) {
                return Uni.createFrom().failure(CommandValidationException(className, ValidateMessage.GOOGLE_ID_TOKEN_INVALID.name))
            }
        }

        return Uni.createFrom().item(CommandValidateResult())
    }
}

enum class ValidateMessage {
    EMAIL_INVALID,
    PASSWORD_INVALID,
    GOOGLE_ID_TOKEN_INVALID
}