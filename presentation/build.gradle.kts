import Dependencies.applyAndroidX
import Dependencies.applyHilt
import Dependencies.applyMaterial

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = Dependencies.COMPILE_SDK
    buildFeatures {
        dataBinding = true
    }
    defaultConfig {
        applicationId = "gyul.songgyubin.whoistheactorinmovie"
        minSdk = Dependencies.MIN_SDK
        targetSdk = Dependencies.TARGET_SDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))

    applyMaterial()
    applyAndroidX()
    applyHilt()

}
kapt {
    correctErrorTypes = true
}
hilt {
    enableTransformForLocalTests = true
}