plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "NebulaFlow"

include("notification-service")
include("task-management-service")
include("user-management-service")
