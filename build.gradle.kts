plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.muslimcompanion"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.muslimcompanion"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}
