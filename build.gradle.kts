buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.android.tools.build:gradle:4.2.0-alpha16")
    }
}
group = "com.rolekbartlomiej.tiply"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
