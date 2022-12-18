plugins {
    id("com.android.application")
    // id("org.jmailen.kotlinter")
    kotlin("android")
}

android {
    namespace = "social.tangent.mobile.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "social.tangent.mobile.android"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

// I don't know why gradle fails to fetch the latest versions of these...
configurations.all {
    resolutionStrategy {
        force("androidx.collection:collection:1.1.0")
        force("androidx.exifinterface:exifinterface:1.3.2")
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.ui:ui:1.3.2")
    implementation("androidx.compose.ui:ui-tooling:1.3.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.2")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("com.airbnb.android:lottie-compose:5.2.0")
    implementation("io.coil-kt:coil:2.2.2")
    implementation("io.coil-kt:coil-compose:2.2.2")
    implementation("io.coil-kt:coil-gif:2.2.2")
    implementation("io.coil-kt:coil-svg:2.2.2")
    implementation("io.coil-kt:coil-video:2.2.2")
}