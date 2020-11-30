import org.gradle.kotlin.dsl.DependencyHandlerScope

object Versions {
    const val kotlin = "1.4.10"
    const val appCompat = "1.2.0"
    const val compose = "1.0.0-alpha07"
    const val nav_compose = "1.0.0-alpha02"
}

fun DependencyHandlerScope.composeDependencies() {
    "implementation"(Compose.ui)
    "implementation"(Compose.foundation)
    "implementation"(Compose.uiTooling)
    "implementation"(Compose.material)
    "implementation"(Compose.uiGraphics)
    "implementation"(Compose.runtimeLiveData)
    "implementation"(Compose.navigation)
}

object Dependencies {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
}

object AndroidSdk {
    const val min = 24
    const val compile = 29
    const val target = compile
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val uiTooling = "androidx.ui:ui-tooling:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.nav_compose}"
}