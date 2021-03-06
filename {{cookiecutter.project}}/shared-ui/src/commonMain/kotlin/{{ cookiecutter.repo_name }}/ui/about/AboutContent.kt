package {{ cookiecutter.repo_name }}.ui.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import {{ cookiecutter.repo_name }}.ui.theme.Fonts

@Composable
fun AboutContent() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "This is a showcase application built using Jetpack Compose that uses alicerce template.",
            style = MaterialTheme.typography.h4,
            fontFamily = Fonts.BigNoodleTitlingFont(),
            textAlign = TextAlign.Center
        )
    }
}