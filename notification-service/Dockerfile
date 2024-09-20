FROM openjdk:11-jdk

WORKDIR /app

COPY build/libs/notification-service-0.0.1-SNAPSHOT.jar /app/notification-service.jar

EXPOSE 8082

CMD ["java",  "-jar", "/app/notification-service.jar"]
