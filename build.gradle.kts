// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories {
        google()
        mavenCentral()
    }
    dependencies{
        classpath(libs.kotlin.gradle.plugin)
//        classpath(Dependencies.gmsVersion)
//        classpath(Dependencies.hiltAgp)
//        classpath(Dependencies.navSafeArgs)

    }
}