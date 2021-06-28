import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    application
    id("org.jetbrains.kotlin.jvm") version "1.5.20"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

application {
    mainClass.set("info.ls.armstrong.ArmstrongKt")

    applicationDefaultJvmArgs = listOf(
        "-server",
        "-Djava.awt.headless=true",
        "-Xms128m",
        "-Xmx256m",
        "-XX:+UseG1GC",
        "-XX:MaxGCPauseMillis=100"
    )
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
    testImplementation(kotlin("test-junit"))
}

tasks.withType<Test> {
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events("passed", "failed", "skipped")
    }
}
