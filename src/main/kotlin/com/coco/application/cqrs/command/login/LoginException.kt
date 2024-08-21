package com.coco.application.cqrs.command.login

/**
@author Yu-Jing
@create 2024-08-14-下午 07:54
 */
class UserNotFoundException(message: String): Exception(message)