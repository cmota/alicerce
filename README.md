# Alicerce

Alicerce is a template for Android, Desktop and Web applications built using Kotlin Multiplatform and Compose with ❤️

👉 [Presentation][1]

👉 [Project][2]

## Set up the environment

You're going to need Android Studio (at least Arctic Fox version) with the KMM plugin installed.

### Running the apps

1. Clone the project locally

	git clone https://github.com/cmota/Alicerce.git

2. Open project with Android Studio

3. Wait for project to synchronise


### Android

To compile and install the Android application run:

	./gradlew androidApp:installDebug

### Desktop

To compile and install the Desktop application run:

	./gradlew desktopApp:run

### Android

To compile and run the web application run:

	./gradlew webApp:jsBrowserRun


## Libraries
- [ktor][3]
- [kotlinx.serialization][4]
- [PreCompose][5]
- [Accompanist-Android][6]
- [Accompanist-Desktop][7]


## Screens

[1]:	https://speakerdeck.com/cmota/an-android-a-desktop-and-a-web-developer-enter-in-a-bar
[2]:	https://github.com/cmota/alicerce
[3]:	https://github.com/ktorio/ktor
[4]:	https://github.com/Kotlin/kotlinx.serialization
[5]:	https://github.com/Tlaster/PreCompose/
[6]:	https://github.com/google/accompanist/
[7]:	https://github.com/Syer10/accompanist/
