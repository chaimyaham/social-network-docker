FROM maven:3.8-openjdk-17 AS build

WORKDIR /app

COPY . .
RUN chmod +x mvnw
RUN mvn clean package

# Étape d'exécution
FROM openjdk:17-jre-slim

WORKDIR /app

COPY --from=build /app/target/discovery-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "discovery-0.0.1-SNAPSHOT.jar"]

# Base de données PostgreSQL
FROM postgres:latest

ENV POSTGRES_DB social-networks
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 1234

EXPOSE 5432