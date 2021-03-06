package {{ cookiecutter.repo_name }}.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import {{ cookiecutter.repo_name }}.ui.platform.Font

object Fonts {
    @Composable
    fun BigNoodleTitlingFont() = FontFamily(
        Font(
            "BigNoodleTitlingFontFamily",
            "big_noodle_titling",
            FontWeight.Normal,
            FontStyle.Normal
        )
    )
}