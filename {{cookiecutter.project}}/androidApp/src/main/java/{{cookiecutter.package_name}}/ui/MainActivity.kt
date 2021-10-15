package {{cookiecutter.package_name}}.ui

import android.os.Bundle
import {{cookiecutter.package_name}}.ui.main.MainScreen
import {{cookiecutter.package_name}}.ui.theme.AlicerceTheme
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

const val TAG = "MainActivity-Android"

class MainActivity : PreComposeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AlicerceTheme {
                MainScreen()
            }
        }
    }
}