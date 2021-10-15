package {{ cookiecutter.repo_name }}

import {{ cookiecutter.repo_name }}.platform.Platform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}