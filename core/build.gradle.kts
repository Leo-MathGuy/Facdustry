plugins {
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

application {
    mainClass.set("facdustry.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
