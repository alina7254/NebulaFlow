plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "com.usermanagement"
version = "0.0.1-SNAPSHOT"



buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-starter-web")
        classpath("org.springframework.boot:spring-boot-starter-data-jpa")
        classpath("org.springframework.boot:spring-boot-starter-security")
        classpath("org.springframework.session:spring-session-data-redis")
        classpath("org.springframework.boot:spring-boot-starter-data-redis")
        classpath("org.springframework.boot:spring-boot-starter-validation")
        classpath("com.mysql:mysql-connector-j:8.2.0")
        classpath("org.projectlombok:lombok")
        classpath("com.fasterxml.jackson.module:jackson-module-kotlin")
        classpath("org.jetbrains.kotlin:kotlin-reflect")
        classpath("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        developmentOnly("org.springframework.boot:spring-boot-docker-compose")
        annotationProcessor("org.projectlombok:lombok")
        testImplementation("com.h2database:h2")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.usermanagement.UserManagementApplication"
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}


tasks.withType<BootJar> {
    archiveFileName.set("user-management-service-0.0.1-SNAPSHOT.jar")
}

springBoot {
    mainClass.set("com.usermanagement.UserManagementApplication")
}

