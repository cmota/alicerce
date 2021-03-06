import org.jetbrains.compose.compose
import java.util.Properties

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.0.0-alpha3"
    id("com.android.library")
    id("maven-publish")
    id("signing")
}

repositories {
    google()
}

group = "moe.tlaster"
version = "0.2.2"

kotlin {
    android {
        publishLibraryVariants("release", "debug")
    }
    jvm("desktop") {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    dependencies {
        implementation("io.ktor:ktor-client-android:1.6.4")
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.foundation)
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation(compose("org.jetbrains.compose.ui:ui-test-junit4"))
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0-beta01")
                api("androidx.savedstate:savedstate-ktx:1.1.0")
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }
        val desktopMain by getting {
            dependencies {
                api(compose.foundation)
                api(compose.runtime)
                api(compose.material)
                api(compose.ui)
                api(compose.desktop.currentOs)
            }
        }
        val desktopTest by getting {
            dependencies {
                implementation(kotlin("test-junit5"))
                implementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
            }
        }
    }
}

android {
    compileSdk = 31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

compose.desktop {
    application { }
}

ext {
    val publishPropFile = rootProject.file("publish.properties")
    if (publishPropFile.exists()) {
        Properties().apply {
            load(publishPropFile.inputStream())
        }.forEach { name, value ->
            set(name.toString(), value)
        }
    } else {
        set("signing.keyId", System.getenv("SIGNING_KEY_ID"))
        set("signing.password", System.getenv("SIGNING_PASSWORD"))
        set("signing.secretKeyRingFile", System.getenv("SIGNING_SECRET_KEY_RING_FILE"))
        set("ossrhUsername", System.getenv("OSSRH_USERNAME"))
        set("ossrhPassword", System.getenv("OSSRH_PASSWORD"))
    }
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    signing {
        sign(publishing.publications)
    }
    repositories {
        maven {
            val releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            url = if (version.toString().endsWith("SNAPSHOT")) {
                uri(snapshotsRepoUrl)
            } else {
                uri(releasesRepoUrl)
            }
            credentials {
                username = project.ext.get("ossrhUsername").toString()
                password = project.ext.get("ossrhPassword").toString()
            }
        }
    }
    publications.withType<MavenPublication> {
        artifact(javadocJar.get())
        pom {
            name.set("PreCompose")
            description.set("A third-party Jetbrains Compose library with ViewModel, LiveData and Navigation support.")
            url.set("https://github.com/Tlaster/PreCompose")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("Tlaster")
                    name.set("James Tlaster")
                    email.set("tlaster@outlook.com")
                }
            }
            scm {
                url.set("https://github.com/Tlaster/PreCompose")
                connection.set("scm:git:git://github.com/Tlaster/PreCompose.git")
                developerConnection.set("scm:git:git://github.com/Tlaster/PreCompose.git")
            }
        }
    }
}
