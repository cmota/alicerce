package {{ cookiecutter.repo_name }}.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import {{ cookiecutter.repo_name }}.ui.R

@Composable
public actual fun icLauncher() = painterResource(R.drawable.ic_launcher)