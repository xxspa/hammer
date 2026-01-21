plugins {
    id("java")
}

group = "com.newzhxu"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":plugin-api"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
tasks.jar {
    manifest {
        attributes["Plugin-Class"] = "com.newzhxu.hello.HelloPlugin"
        attributes["Plugin-Id"] = "hello-plugin"
        attributes["Plugin-Version"] = "1.0.0"
        attributes["Plugin-Provider"] = "newzhxu"
        attributes["Plugin-Description"] = "A hello world plugin"
    }
}

tasks.test {
    useJUnitPlatform()
}