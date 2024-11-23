@file:OptIn(org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalMainFunctionArgumentsDsl::class)

plugins {
    kotlin("multiplatform") version "2.0.21"
}

group = "com.github.ybznek"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        nodejs {
            passProcessArgvToMainFunction()
        }
        binaries.library()
    }
}
