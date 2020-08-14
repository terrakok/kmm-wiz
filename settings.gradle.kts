include(":kmmsharedmodule")
rootProject.name = "wiz2"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
    }
}

include(":androidApp")
include(":shared")

