import Dependencies.applyAndroidX
import Dependencies.applyHilt
import Dependencies.applyKotlinX
import Dependencies.applyRetrofit
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version "1.4.21"
}

android {
    compileSdk = Dependencies.COMPILE_SDK

    defaultConfig {
        minSdk = Dependencies.MIN_SDK
        targetSdk = Dependencies.TARGET_SDK

        buildConfigField("String","MOVIE_KEY",getMovieKey("MOVIE_KEY"))

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
fun getMovieKey(propertyKey:String):String = gradleLocalProperties(rootDir).getProperty(propertyKey)

dependencies {
    implementation(project(":domain"))


    applyAndroidX()
    applyHilt()
    applyRetrofit()
    applyKotlinX()

}