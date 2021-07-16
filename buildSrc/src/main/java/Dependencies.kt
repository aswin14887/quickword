/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * App Configurations
 */
object ConfigData {
    const val applicationId = "com.bflystudios.quickword"
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"
}

/**
 * To define dependencies
 */
object Dependencies {

    //AndroidX
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val androidxCore by lazy { "androidx.core:core-ktx:${Versions.androidxCore}" }


    //Kotlin
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }

    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }

    //JUnit
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val junitExt by lazy { "androidx.test.ext:junit:${Versions.jUnitExt}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }

}