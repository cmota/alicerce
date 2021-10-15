package {{cookiecutter.package_name}}.platform

actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        println("$tag | $message")
    }
}