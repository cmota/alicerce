package com.cmota.alicerce.platform

import android.util.Log

actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        Log.d(tag, message)
    }
}