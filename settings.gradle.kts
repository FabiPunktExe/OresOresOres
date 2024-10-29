pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.architectury.dev/")
        gradlePluginPortal()
    }

    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }
}

rootProject.name = "OresOresOres"

include("oresoresores-1.18.2")
include("oresoresores-1.18.2:common")
include("oresoresores-1.18.2:fabric")
include("oresoresores-1.18.2:forge")
