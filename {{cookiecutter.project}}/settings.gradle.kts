pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }
}
rootProject.name = "{{cookiecutter.project}}"

include(":androidApp")
include(":desktopApp")

include(":shared-ui")
include(":shared-logic")

include(":precompose")
include(":swiperefresh")