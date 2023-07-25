@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.startup.foot6chat"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.startup.foot6chat"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(platform("com.google.firebase:firebase-bom:32.2.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.android.material:material:1.9.0")

    implementation("com.google.gms:google-services:4.3.15")
    implementation("com.android.support:support-annotations:28.0.0")
    implementation("com.google.firebase:firebase-core:11.0.4")
    implementation("com.google.firebase:firebase-database:11.0.4")
    implementation("com.google.firebase:firebase-auth:11.0.4")
    implementation("com.google.firebase:firebase-storage:11.0.4")
    //noinspection GradleCompatible
    implementation("com.android.support:design:28.0.0")
}