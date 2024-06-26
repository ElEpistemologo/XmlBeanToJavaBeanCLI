plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "ovh.xmlbeantojavabean.cli"
version = "0.0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
}

application {
    mainClass = "ovh.xmlbeantojavabean.MainKt"
    applicationName = "xtj"
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

java {
    withSourcesJar()
}

tasks.jar {
    manifest {
        attributes(mapOf("Manifest-Version" to project.version))
        attributes(mapOf("Main-Class" to "ovh.xmlbeantojavabean.MainKt"))
    }
}