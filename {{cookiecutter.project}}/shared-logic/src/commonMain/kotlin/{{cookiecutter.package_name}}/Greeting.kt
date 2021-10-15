package {{cookiecutter.package_name}}

import {{cookiecutter.package_name}}.platform.Platform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}