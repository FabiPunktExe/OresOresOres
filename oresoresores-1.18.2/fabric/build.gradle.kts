plugins {
    id("java")
    id("dev.architectury.loom") version "1.7-SNAPSHOT"
    id("architectury-plugin") version "3.4-SNAPSHOT"
    id("com.modrinth.minotaur") version "2.8.7"
}

architectury {
    platformSetupLoomIde()
    fabric()
}

dependencies {
    minecraft("com.mojang:minecraft:${properties["minecraft_version"]}")
    mappings(loom.officialMojangMappings())
    modApi("net.fabricmc:fabric-loader:${properties["fabric_loader_version"]}")
    modApi("dev.architectury:architectury-fabric:${properties["architectury_api_version"]}")
}

java {
    sourceSets.main.get().java.srcDir("${parent?.project("common")?.projectDir}/src/main/java")
    sourceSets.main.get().resources.srcDir("${parent?.project("common")?.projectDir}/src/main/resources")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release = 17
    }

    processResources {
        filesMatching("fabric.mod.json") {
            expand(mapOf("version" to version,
                         "minecraft_version" to project.properties["minecraft_version"],
                         "fabric_loader_version" to project.properties["fabric_loader_version"],
                         "architectury_api_version" to project.properties["architectury_api_version"]))
        }
    }

    remapJar {
        archiveFileName = "oresoresores-${version}+${project.properties["minecraft_version"]}-${project.name}.jar"
    }
}

modrinth {
    token = System.getenv("MODRINTH_TOKEN")
    projectId = "oresoresores"
    versionName = "Ores Ores Ores $version (Fabric ${properties["minecraft_version"]})"
    versionNumber = version as String
    versionType = "alpha"
    uploadFile.set(tasks.remapJar)
    gameVersions = listOf<String>(properties["minecraft_version"].toString())
    loaders = listOf("fabric")
    dependencies {
        required.project("architectury-api")
    }
    changelog = rootProject.projectDir.resolve("CHANGELOG.md").readText()
}
