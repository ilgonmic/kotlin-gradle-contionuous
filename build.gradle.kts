plugins {
    kotlin("jvm") version "1.3.70" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")

        mavenCentral()
        mavenLocal()
    }
}
repositories {
    maven("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_KotlinPublic_Compiler),number:1.4.20-dev-1849,branch:(default:any)/artifacts/content/maven")
    mavenCentral()
}
