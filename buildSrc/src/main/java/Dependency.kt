import Versions.NAV_VERSION

object Versions {
    const val NAV_VERSION = "2.4.0-alpha10"
}

object kotlin {
    const val SDK = "org.jetbrains.java:java-stdlib-jdk8:1.5.21"
}

object AndroidX {
    const val MATERIAL = "androidx.compose.material:material:1.2.1"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.5.1"
    const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
    const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.5.1"
    const val ACTIVITY = "androidx.activity:activity-ktx:1.5.1"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:1.5.2"
    const val DATABASE = "androidx.datastore:datastore-preferences:1.0.0"
}

object KTX {
    const val CORE = "androidx.core:core-ktx:1.9.0"
}

object Google {
    const val MATERIAL = "com.google.android.material:material:1.6.1"
}

object Test {
    const val JUNIT = "junit:junit:4.+"
    const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
}

object AndroidTest {
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.3"
    const val TEST_RUNNER = "androidx.test:runner:1.4.0"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
}

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:2.38.1"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:2.38.1"
    const val DAGGER_HILT_VIEW_MODEL = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:1.0.0"
}

object Retrofit {
    const val RETROFIT = "com.squareup.retrofit2:retorift:2.9.0"
    const val CONVERTER_GSON = "com.squareup.retrofir2:converter-gson:2.9.0"
    const val CONVERTER_JAXB = "com.squareup.retrofit2:converter-jaxb:2.9.0"
}

object OkHttp {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:4.9.1"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.1"
}

object Coroutines {
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
}

object CameraX {
    const val CAMERA_CORE = "androidx.camera:camera-core:1.1.0"
    const val CAMERA_CAMERA2 = "androidx.camera:camera-camera2:1.1.0"
    const val CAMERA_LIFECYCLE = "androidx.camera:camera-lifecycle:1.1.0"
    const val CAMERA_VIEW = "androidx.camera:camera-view:1.1.0"
    const val CAMERA_EXTENTIONS = "androidx.camera:camera-extensions:1.1.0"
}

object NavComponent {
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAV_VERSION"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:$NAV_VERSION"
    const val NAVIGATION_DYNAMIC_FEATURES_FRAGMENT = "androidx.navigation:navigation-dynamic-features-fragment:$NAV_VERSION"
    const val NAVIGATION_TESTING = "androidx.navigation:navigation-testing:$NAV_VERSION"
    const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:2.5.2"
}