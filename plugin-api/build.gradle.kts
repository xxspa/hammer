plugins {
    id("java-library")
}

group = "com.newzhxu"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api("org.pf4j:pf4j-spring:0.10.0") {
        exclude("org.slf4j", "slf4j-reload4j")
    }
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}