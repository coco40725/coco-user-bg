package com.coco.application.cqrs.command.login

import com.coco.application.cqrs.command.base.CommandValidateResult
import com.coco.application.cqrs.command.base.CommandValidator
import com.coco.domain.enums.ProviderType
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped

/**
@author Yu-Jing
@create 2024-08-14-下午 08:00
 */

@ApplicationScoped
class LoginValidate: CommandValidator<LoginCommand> {
    override fun validateCommand(command: LoginCommand): Uni<CommandValidateResult> {
        var isValid = true
        val message = mutableListOf<String>()
        val type = command.providerType

        // rule 1: if LoginType is WEB, then email and password must not be null
        if (type == ProviderType.WEB) {
            if (command.email.isNullOrEmpty()) {
                isValid = false
                message.add("email must not be null")
            }
            if (command.password.isNullOrEmpty()) {
                isValid = false
                message.add("password must not be null")
            }
        }

        // rule 2: if LoginType is GOOGLE, then idToken must not be null
        if (type == ProviderType.GOOGLE) {
            if (command.idToken.isNullOrEmpty()) {
                isValid = false
                message.add("idToken must not be null")
            }
        }

        return Uni.createFrom().item(CommandValidateResult(isValid, message))
    }
}