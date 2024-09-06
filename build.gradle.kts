plugins {
    kotlin("jvm") version "1.6.21" apply false
    kotlin("plugin.spring") version "1.6.21" apply false
    kotlin("plugin.allopen") version "1.6.21" apply false
    kotlin("plugin.noarg") version "1.6.21" apply false
    id("org.springframework.boot") version "2.7.12" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.register<DependencyReportTask>("allDependencies"){}
}



