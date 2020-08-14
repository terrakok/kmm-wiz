plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.appcompat:appcompat:${properties["version.androidx.appcompat"]}")
    implementation("com.google.android.material:material:${properties["version.google.material"]}")
    implementation("androidx.constraintlayout:constraintlayout:${properties["version.androidx.constraintlayout"]}")
}

android {
    compileSdkVersion((properties["android.compileSdk"] as String).toInt())
    defaultConfig {
        applicationId = "com.example.androidApp"
        minSdkVersion((properties["android.minSdk"] as String).toInt())
        targetSdkVersion((properties["android.targetSdk"] as String).toInt())
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}