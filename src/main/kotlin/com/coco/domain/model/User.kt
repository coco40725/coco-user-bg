package com.coco.domain.model

import com.coco.domain.enums.ProviderType
import java.util.*

/**
@author Yu-Jing
@create 2024-08-14-下午 03:21
 */
data class User(
    var id: String,
    var name: String,
    var email: String,
    var password: String? = null,
    var provider: ProviderType? = null,
    var emailVerify: Boolean? = null,
    var createDate: Date,
    var enabled: Boolean
)
