FROM openjdk:11-jdk

WORKDIR /app

COPY build/libs/user-management-service-0.0.1-SNAPSHOT.jar /app/user-management-service.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/user-management-service.jar"]

