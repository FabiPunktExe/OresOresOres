plugins {
    id("java")
    id("dev.architectury.loom") version "1.7-SNAPSHOT"
    id("architectury-plugin") version "3.4-SNAPSHOT"
}

dependencies {
    minecraft("com.mojang:minecraft:${properties["minecraft_version"]}")
    mappings(loom.officialMojangMappings())
    modApi("dev.architectury:architectury:${properties["architectury_api_version"]}")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release = 17
    }
}
