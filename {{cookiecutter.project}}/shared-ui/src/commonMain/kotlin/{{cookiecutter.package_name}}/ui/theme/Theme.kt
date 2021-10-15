package {{cookiecutter.package_name}}.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AlicerceTheme(content: @Composable () -> Unit) {

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}