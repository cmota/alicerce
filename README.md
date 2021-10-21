## alicerce

Hello 🌍!

_a-li-cerce_, alicerce (that means foundation in Portuguese) was built to easily allow to setup a project where you're going to share both your business logic and your UI between an Android and a Desktop application. It takes advantage of Kotlin Multiplatform for the fist and Compose for the second.

### Setup alicerce

In order to setup alicerce you'll need to install [cookiecutter](https://github.com/cookiecutter/cookiecutter).

Once done you just to need to run over the root folder of this project:

```
cookiecutter .
```

You'll be prompted to define a set of variables for the project:

* project [alicerce]: 
Corresponds to your project name.

* author [@cafonsomota]: 
To the author of the project: you 🙂.

* repo_name [com.cmota.alicerce]: 
The package name of your project. Don't forget that you need to add at least a "." since it's mandatory by Android.

* version [0.1]: 
The project version.

* description [alicerce brings KMP and Compose together so you can share everything between your Android and Desktop apps]: 
A description of the project that you're going to build.


**Note:** The values between brackets are added by default if you don't enter anything.

Once you've filled all of these steps a new folder with the **project** name that you've defined is created. 

You should open this folder in Android Studio.


### Running your project

After the setup mentioned above, you need to open the newly created folder with Android Studio (remember that's this new folder and not alicerce root). Wait for the project to synchronize.

This initial synchronization might take a while, since you're going to fetch a lot of dependencies (for Kotlin Multiplatform and Compose).

#### Running your Android App

Once the synchronization ends, you can compile and run your android app by just clicking on the green arrow near _Edit configurations_ on top.

#### Running your Desktop App

To run the desktop app you'll need to enter this command on the Terminal (you can use the one built in with Android Studio):

```
./gradlew :desktopApp:run
```


#### Mac OS

You need to have python installed. If you don't, run:

```
brew install python3
```

And add to the **.bash_profile**:

```
export PATH=$HOME/.local/bin:$PATH
```

Now to install **cookiecutter** you just need to run:

```
pip install --user cookiecutter
```

#### Windows

You need to have python installed. If you don't, go over to the official [website](https://www.python.org/downloads/windows/), download and install the version that's compatible with your system.

When prompted, don't forget to select: "Add Python 3.7 to PATH", otherwise you'll need to do this manually.

You can now install cookiecutter via **pip**, for that run:

```
pip install cookiecutter
```

Note: in order to use this template you need to also have Java installed on your machine.


### Project Structure

alicerce is divided into the following modules:

- **androidApp**
Contains the AndroidManifest and your Android application activities.

- **desktopApp**
Contains your Desktop app `main` application.

- **gradle**
The Gradle wrapper use to compile the project

- [**precompose**](https://github.com/Tlaster/PreCompose)
A library that allows to use ViewModel, LiveData and Navigation components both on Android and Desktop applications

- **shared-logic**
The business logic of both applications. Network requests, local storage, etc. they should all be here.

- **shared-ui**
The access to **shared-logic** and all the **Composables** that are going to be used to design both apps.

- [**swiperefresh**](https://github.com/Syer10/accompanist/tree/main/swiperefresh)
A port of the accompanist [swiperefresh](https://github.com/google/accompanist/tree/main/swiperefresh) library that allows it to be use both on android and desktop.


**Note:** although **precompose** and **swiperefresh** are libraries that are published, currently those version don't support either being reused between android and desktop or the latest Compose/Kotlin version.


### Contributions

Feel free to contribute! All PR are more than welcome as well as all suggestions to improve this template 🙌.

