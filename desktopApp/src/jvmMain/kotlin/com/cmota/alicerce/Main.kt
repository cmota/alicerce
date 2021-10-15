package com.cmota.alicerce

import androidx.compose.desktop.DesktopTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.cmota.alicerce.ui.main.MainScreen
import com.cmota.alicerce.ui.theme.AlicerceTheme
import moe.tlaster.precompose.PreComposeWindow

fun main() {

    application {
        val windowState = rememberWindowState(width = 460.dp, height = 900.dp)

        PreComposeWindow(
            onCloseRequest = ::exitApplication,
            state = windowState,
            title = "Alicerce"
        ) {
            Surface(modifier = Modifier.fillMaxSize()) {
                DesktopTheme {

                    AlicerceTheme {
                        MainScreen()
                    }
                }
            }
        }
    }
}