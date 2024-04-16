plugins {
    kotlin("jvm") version "1.9.22"
    java
}

group = "ovh.xmlbeantojavabean.api"
version = "0.0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.1.0-jre")
    implementation("com.sun.xml.bind:jaxb-impl:4.0.5")
    implementation("com.squareup:javapoet:1.13.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
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
    }
}