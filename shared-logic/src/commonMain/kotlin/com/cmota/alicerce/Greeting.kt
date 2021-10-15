package com.cmota.alicerce

import com.cmota.alicerce.platform.Platform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}