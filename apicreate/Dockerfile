FROM maven:3.8.7-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY . .
RUN mvn clean package -DskipTests
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /target/apicreate-0.0.1-SNAPSHOT.jar apicreate.jar
EXPOSE 8020
ENTRYPOINT ["java","-jar","apicreate.jar"]