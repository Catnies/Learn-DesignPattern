plugins {
    id("java")
    // kotlin("jvm")
}

group = "top.catnies"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // implementation(kotlin("stdlib-jdk8"))

    compileOnly("org.projectlombok:lombok:1.18.34") // Lombok
    annotationProcessor("org.projectlombok:lombok:1.18.34") // Lombok
}

tasks.test {
    useJUnitPlatform()
}
//kotlin {
//    jvmToolchain(21)
//}