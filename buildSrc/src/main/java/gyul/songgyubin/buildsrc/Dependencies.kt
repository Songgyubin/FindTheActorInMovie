import org.gradle.kotlin.dsl.DependencyHandlerScope
import kotlin.coroutines.Continuation

object Dependencies {

    const val COMPILE_SDK = 32
    const val MIN_SDK = 27
    const val TARGET_SDK = 32

    private const val implementation = "implementation"
    private const val testImplementation = "testImplementation"
    private const val androidTestImplementation = "androidTestImplementation"

    private const val kapt = "kapt"
    private const val kaptTest = "kaptTest"
    private const val kaptAndroidTest = "kaptAndroidTest"

    object Kotlin {
        const val VERSION = "1.7.10"
    }


    object Google {
        const val MATERIAL = "com.google.android.material:material:1.6.1"
    }

    fun DependencyHandlerScope.applyMaterial() {
        implementation(Google.MATERIAL)
    }

    object AndroidX {
        const val APPCOMPAT = "androidx.appcompat:appcompat:1.5.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.5.2"
        const val CORE = "androidx.core:core-ktx:1.8.0"

    }

    fun DependencyHandlerScope.applyAndroidX() {
        implementation(AndroidX.APPCOMPAT)
        implementation(AndroidX.CORE)
        implementation(AndroidX.FRAGMENT)
        implementation(AndroidX.CONSTRAINT_LAYOUT)
    }

    object Retrofit {
        const val VERSION = "2.9.0"

        const val RETROFIT = "com.squareup.retrofit2:retrofit:$VERSION"
        const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$VERSION"
    }
    fun DependencyHandlerScope.applyRetrofit(){
        implementation(Retrofit.RETROFIT)
        implementation(Retrofit.CONVERTER_GSON)
    }

    object Hilt {
        const val VERSION = "2.42"

        const val CORE = "com.google.dagger:hilt-android:$VERSION"
        const val COMPILER = "com.google.dagger:hilt-compiler:$VERSION"

        // For instrumentation tests
        const val ANDROID_TESTING = "com.google.dagger:hilt-android-testing:$VERSION"
        const val ANDROID_TESTING_COMPILER = "com.google.dagger:hilt-compiler:$VERSION"

        // For local unit tests
        const val LOCAL_TESTING = "com.google.dagger:hilt-android-testing:$VERSION"
        const val LOCAL_TESTING_COMPILER = "com.google.dagger:hilt-compiler:$VERSION"
    }

    fun DependencyHandlerScope.applyHilt() {
        implementation(Hilt.CORE)
        kapt(Hilt.COMPILER)

        kaptTest(Hilt.LOCAL_TESTING_COMPILER)
        testImplementation(Hilt.LOCAL_TESTING)

        androidTestImplementation(Hilt.ANDROID_TESTING)
        kaptAndroidTest(Hilt.ANDROID_TESTING_COMPILER)
    }


    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROID_EXT_JUNIT = "androidx.test.ext:junit:1.1.3"
        const val ANDROID_ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
        const val MOCKITO = "org.mockito:mockito-core:2.28.2"
    }

    fun DependencyHandlerScope.applyTest() {
        Dependencies.testImplementation(Test.JUNIT)
        Dependencies.testImplementation(Test.MOCKITO)
        androidTestImplementation(Test.ANDROID_EXT_JUNIT)
        androidTestImplementation(Test.ANDROID_ESPRESSO_CORE)
    }

}