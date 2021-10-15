package {{ cookiecutter.repo_name }}.platform

import android.util.Log

actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        Log.d(tag, message)
    }
}