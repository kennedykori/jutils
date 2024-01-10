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
  // Apply the checkstyle plugin to perform quality checks on the project sources
  checkstyle
  // Apply the maven publish plugin
  `maven-publish`
  // Checker Framework pluggable type-checking.
  // This MUST be applied after plugins that introduce Java compilation tasks,
  // typically `java` or `java-library`.
  alias(libs.plugins.checker.framework)

  alias(libs.plugins.spotless)
}

checkstyle { toolVersion = libs.versions.checkstyle.get() }

apply(plugin = "org.checkerframework")

configure<org.checkerframework.gradle.plugin.CheckerFrameworkExtension> {
  checkers =
      listOf(
          "org.checkerframework.checker.formatter.FormatterChecker",
          "org.checkerframework.checker.index.IndexChecker",
          "org.checkerframework.checker.nullness.NullnessChecker",
          "org.checkerframework.common.value.ValueChecker",
          "org.checkerframework.framework.util.PurityChecker",
      )

  extraJavacArgs =
      listOf(
          // "--module-path", configurations.compileOnly.get().asPath
          // "-Werror",
          "-AcheckPurityAnnotations",
          "-ArequirePrefixInWarningSuppressions",
          "-AshowPrefixInWarningMessages",
          "-AsuggestPureMethods",
          "-AwarnRedundantAnnotations",
          "-AwarnUnneededSuppressions",
      )
}

dependencies {
  // Use JUnit test framework
  testImplementation(libs.junit.jupiter)

  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
  toolchain { languageVersion.set(JavaLanguageVersion.of(11)) }
  withJavadocJar()
  withSourcesJar()
}

repositories {
  // Use jcenter for resolving dependencies.
  // You can declare any Maven/Ivy/file repository here.
  mavenCentral()
  mavenLocal()
}

spotless {
  format("misc") {
    // define the files to apply `misc` to
    target(".gitattributes", ".gitignore", ".toml")

    // define the steps to apply to those files
    trimTrailingWhitespace()
    indentWithSpaces(4)
    endWithNewline()
  }
  java {
    // Rearrange imports using the default importOrder configuration.
    importOrder()
    // Remove unused imports. Use `cleanthat-javaparser-unnecessaryimport`
    // which enables processing any language level source file with a JDK8+ Runtime.
    removeUnusedImports("cleanthat-javaparser-unnecessaryimport")
    // Refactor code
    cleanthat()
    // Format using google-java-format.
    // https://github.com/google/google-java-format
    googleJavaFormat()
    // Fix formatting of type annotations.
    // See https://github.com/diffplug/spotless/tree/main/plugin-gradle#formatannotations
    formatAnnotations()
  }
  kotlinGradle {
    target("*.gradle.kts")
    ktlint()
    ktfmt()
  }
}

tasks.jacocoTestCoverageVerification {
  dependsOn(tasks.jacocoTestReport)
  violationRules { rule { limit { minimum = "1.0".toBigDecimal() } } }
}

tasks.jacocoTestReport {
  dependsOn(tasks.test)
  reports {
    html.required = true
    xml.required = true
  }
}

tasks.jar {
  manifest {
    attributes(
        mapOf(
            "Automatic-Module-Name" to "io.github.kennedykori.utils",
            "Implementation-Title" to project.name,
            "Implementation-Version" to project.version,
        ),
    )
  }
}

tasks.test {
  // Use JUnit Platform for unit tests.
  useJUnitPlatform()
  testLogging { events("passed", "skipped", "failed") }
}

tasks.withType<Checkstyle>().configureEach {
  configFile = configDirectory.get().file("google_checks.xml").asFile
  reports {
    html.required = true
    xml.required = true
  }
}
