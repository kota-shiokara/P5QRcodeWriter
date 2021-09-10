plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    application
//    id 'org.jetbrains.kotlin.jvm' version '1.4.10'
//    id 'com.github.johnrengelman.shadow' version '2.0.4'
}

application{
    mainClassName = "com.ikanoshiokara.p5qrcodewriter.MainKt"
}

group = "com.ikanoshiokara"
version = "1.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.processing:core:3.3.7")
//    compile 'com.google.zxing:zxing-parent:3.4.1'
    implementation("com.google.zxing:core:3.4.1")
    implementation("com.google.zxing:javase:3.4.1")
//    testCompile group: 'junit', name: 'junit', version: '4.12'
}
//
//jar {
//    manifest {
//        attributes 'Main-Class': "MainKt"
//    }
//}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}