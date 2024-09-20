plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}



allprojects {
    repositories {
        mavenCentral()
    }


    subprojects {
        tasks.register<DependencyReportTask>("allDependencies") {}
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}


tasks.withType<JavaCompile> {
    options.release.set(17)
}
