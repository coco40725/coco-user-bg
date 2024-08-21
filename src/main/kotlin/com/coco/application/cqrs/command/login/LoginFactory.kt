package com.coco.application.cqrs.command.login

import com.coco.application.cqrs.command.login.impl.*
import com.coco.domain.enums.ProviderType
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-14-下午 03:40
 */
@ApplicationScoped
class LoginFactory @Inject constructor(
    private val googleLoginStrategy: GoogleLoginStrategy,
    private val webLoginStrategy: WebLoginStrategy,
){

    fun getLoginStrategy(type: ProviderType): LoginStrategy {
        return when (type) {
            ProviderType.GOOGLE -> googleLoginStrategy
            ProviderType.WEB -> webLoginStrategy
        }
    }
}