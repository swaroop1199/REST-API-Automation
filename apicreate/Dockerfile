FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY apicreate/pom.xml .
COPY apicreate/src ./src  
RUN mvn clean package -DskipTests
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/apicreate-0.0.1-SNAPSHOT.jar apicreate.jar
EXPOSE 10000
ENTRYPOINT ["java","-jar","apicreate.jar"]