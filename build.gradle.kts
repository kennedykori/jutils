/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java Library project to get you started.
 * For more details take a look at the Java Libraries chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.6.1/userguide/java_library_plugin.html
 */

project.group = "io.github.kennedykori"
project.version = "2.0.0"

plugins {
    // Apply the java-library plugin to add support for Java Library
    `java-library`
    // Apply the jacoco plugin to aid in test coverage
    jacoco
    // Apply the maven publish plugin
    `maven-publish`
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    mavenCentral()
    mavenLocal()
}

dependencies {
    // Use JUnit test framework
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
    withJavadocJar()
    withSourcesJar()
}

tasks.jar {
    manifest {
        attributes(mapOf(
                "Automatic-Module-Name" to "io.github.kennedykori.utils",
                "Implementation-Title" to project.name,
                "Implementation-Version" to project.version))
    }
}

tasks.jacocoTestCoverageVerification {
    dependsOn(tasks.jacocoTestReport)
    violationRules {
        rule {
            limit {
                minimum = "1.0".toBigDecimal()
            }
        }
    }
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        html.required = true
        xml.required = true
    }
}

tasks.test {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
