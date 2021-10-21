package {{ cookiecutter.repo_name }}.ui.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import {{ cookiecutter.repo_name }}.ui.components.{{ cookiecutter.project }}TopAppBar
import {{ cookiecutter.repo_name }}.ui.theme.Fonts
import {{ cookiecutter.repo_name }}.ui.theme.colorContent


@Composable
fun MainTopAppBar() {

    {{ cookiecutter.project }}TopAppBar(
        title = {
            Text(
                text = "{{ cookiecutter.project }}",
                style = typography.h4,
                fontFamily = Fonts.BigNoodleTitlingFont()
            )
        },
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = colorContent,
        elevation = 0.dp
    )
}