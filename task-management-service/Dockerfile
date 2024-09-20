FROM openjdk:11-jdk

WORKDIR /app

COPY build/libs/task-management-service-0.0.1-SNAPSHOT.jar /app/task-management-service.jar

EXPOSE 8081

CMD ["java", "-verbose", "-jar", "/app/task-management-service.jar"]
