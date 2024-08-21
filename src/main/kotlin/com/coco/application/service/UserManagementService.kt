package com.coco.application.service

import com.coco.domain.model.User
import com.coco.infra.repo.UserRepo
import io.quarkus.elytron.security.common.BcryptUtil
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

/**
@author Yu-Jing
@create 2024-08-14-下午 03:54
 */
@ApplicationScoped
class UserManagementService @Inject constructor(
    private val userRepo: UserRepo,
) {

    fun findUser(email: String): Uni<User?> {
        return userRepo.findOneByEnableEmail(email)
    }

    fun createUser(user: User): Uni<User> {
        return userRepo.insertOne(user)
    }

    fun verifyPassword(plainPassword: String, hashedPassword: String): Boolean {
        return BcryptUtil.matches(plainPassword, hashedPassword)
    }

    fun hashPassword(password: String): String? {
        return BcryptUtil.bcryptHash(password);
    }
}