dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
}


rootProject.name = "WhoIsTheActorInMovie"
include(
    ":presentation",
    ":data",
    ":domain"
)
