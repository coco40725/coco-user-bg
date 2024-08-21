package com.coco.application.middleware.auth

import jakarta.ws.rs.NameBinding
import jakarta.ws.rs.ext.Provider

/**
@author Yu-Jing
@create 2024-08-21-上午 10:00
 */


@NameBinding
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(value = AnnotationRetention.RUNTIME)
annotation class Logged {
}