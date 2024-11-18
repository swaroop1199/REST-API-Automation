FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY apicreate/pom.xml .
RUN mvn dependency:go-offline
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
WORKDIR /app
RUN mvn spring-boot:run
EXPOSE 8020
ENTRYPOINT ["java","-jar","apicreate.jar"]