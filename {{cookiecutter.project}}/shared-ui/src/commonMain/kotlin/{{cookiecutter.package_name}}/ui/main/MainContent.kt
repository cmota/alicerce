package {{ cookiecutter.repo_name }}.ui.main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import {{ cookiecutter.repo_name }}.ui.about.AboutContent

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainContent() {

    AboutContent()
}