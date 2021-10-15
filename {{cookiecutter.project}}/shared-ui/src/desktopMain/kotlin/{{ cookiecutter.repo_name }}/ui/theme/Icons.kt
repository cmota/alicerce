package {{ cookiecutter.repo_name }}.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
public actual fun icLauncher() = painterResource("images/ic_launcher.png")
