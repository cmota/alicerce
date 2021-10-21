package {{ cookiecutter.repo_name }}.ui

import android.os.Bundle
import {{ cookiecutter.repo_name }}.ui.main.MainScreen
import {{ cookiecutter.repo_name }}.ui.theme.{{ cookiecutter.project }}Theme
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

private const val TAG = "MainActivity"

class MainActivity : PreComposeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            {{ cookiecutter.project }}Theme {
                MainScreen()
            }
        }
    }
}