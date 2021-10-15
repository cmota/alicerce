package com.cmota.alicerce.ui.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cmota.alicerce.ui.components.AlicerceTopAppBar
import com.cmota.alicerce.ui.theme.Fonts
import com.cmota.alicerce.ui.theme.colorContent


@Composable
fun MainTopAppBar() {

    AlicerceTopAppBar(
        title = {
            Text(
                text = "Alicerce",
                style = typography.h4,
                fontFamily = Fonts.BigNoodleTitlingFont()
            )
        },
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = colorContent,
        elevation = 0.dp
    )
}