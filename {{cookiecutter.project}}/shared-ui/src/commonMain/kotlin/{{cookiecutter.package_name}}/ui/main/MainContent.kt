package {{cookiecutter.package_name}}.ui.main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import {{cookiecutter.package_name}}.ui.about.AboutContent

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainContent() {

    AboutContent()
}