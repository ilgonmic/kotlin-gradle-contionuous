plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_KotlinPublic_Compiler),number:1.4.20-dev-1849,branch:(default:any)/artifacts/content/maven")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":lib"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().named("compileKotlin") {
    destinationDir = rootProject.buildDir.resolve("output2")
}