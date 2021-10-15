package com.cmota.alicerce.ui

import android.os.Bundle
import com.cmota.alicerce.ui.main.MainScreen
import com.cmota.alicerce.ui.theme.AlicerceTheme
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

const val TAG = "MainActivity-Android"

class MainActivity : PreComposeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AlicerceTheme {
                MainScreen()
            }
        }
    }
}