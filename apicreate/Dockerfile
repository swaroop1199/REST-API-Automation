FROM maven:3.9.9-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.0-jdk-slim
COPY --from=build /target/apicreate-0.0.1-SNAPSHOT.jar apicreate.jar
EXPOSE 8020
ENTRYPOINT ["java","-jar","apicreate.jar"]