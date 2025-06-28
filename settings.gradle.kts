enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven {
            name = "Central Portal Snapshots"
            url = uri ( "https://central.sonatype.com/repository/maven-snapshots/" )
        }
//        mavenLocal ()
        // Para consumir artefatos locais
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            name = "Central Portal Snapshots"
            url = uri ( "https://central.sonatype.com/repository/maven-snapshots/" )
        }
//        mavenLocal ()
        // Para consumir artefatos locais 
    }
}

rootProject.name = "betbot"
include(":betbot_android")
include(":shared")
include(":betUI")