plugins {
    `java-library`
    kotlin("jvm") version "1.3.31"
    id("com.github.ben-manes.versions") version "0.20.0"
}

repositories {
    mavenCentral()
    maven { url = uri("http://dl.bintray.com/jetbrains/spek") }
}

tasks.test {
    useJUnitPlatform()
}

dependencies {

    // JUnit Vintage
    testImplementation("junit:junit:4.12")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.4.2")

    // JUnit Jupiter
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")

    // jqwik
    testImplementation("net.jqwik:jqwik:0.9.1")

    // Spek
    testImplementation("org.jetbrains.spek:spek-api:1.1.5")
    testRuntimeOnly("org.jetbrains.spek:spek-junit-platform-engine:1.1.5")
    testImplementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("reflect"))

}
