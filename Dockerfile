# FROM amazoncorretto:21
# FROM amazoncorretto:21.0.4-alpine3.18
FROM amazoncorretto:21-alpine3.24-jdk
# FROM openjdk:21-ea-33-slim-bullseye

WORKDIR /app
ARG JAR_FILE=SpringBootRestService-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} SpringBootRestService.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringBootRestService.jar"]
