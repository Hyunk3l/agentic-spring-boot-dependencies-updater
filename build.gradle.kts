plugins {
    kotlin("jvm") version "2.1.21"
    application
}

group = "com.fabridinapoli"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("ai.koog:koog-agents:0.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

application {
    mainClass.set("com.fabridinapoli.spring_boot_dependencies_updater.AgenticSpringBootDependenciesUpdaterApplicationKt")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
