import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.0"
}

group = "dev.jamiecraane"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.1")
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
