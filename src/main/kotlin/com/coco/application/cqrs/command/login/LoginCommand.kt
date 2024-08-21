package com.coco.application.cqrs.command.login

import com.coco.application.cqrs.command.base.Command
import com.coco.domain.enums.ProviderType
import io.smallrye.mutiny.Uni
import jakarta.ws.rs.core.Response

/**
@author Yu-Jing
@create 2024-08-14-下午 03:38
 */
class LoginCommand(
    var idToken: String? = null,
    var email: String? = null,
    var password: String? = null,
    var providerType: ProviderType
): Command<Uni<Response?>>
