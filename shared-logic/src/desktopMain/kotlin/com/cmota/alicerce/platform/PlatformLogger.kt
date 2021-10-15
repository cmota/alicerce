package com.cmota.alicerce.platform

actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        println("$tag | $message")
    }
}