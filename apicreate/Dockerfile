FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY apicreate/pom.xml .
RUN mvn dependency:go-offline
COPY . .
RUN mvn clean package -DskipTests
FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/apicreate-0.0.1-SNAPSHOT.jar apicreate.jar
EXPOSE 10000
ENTRYPOINT ["java","-jar","apicreate.jar"]