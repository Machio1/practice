FROM maven:3.9-eclipse-temurin-26

RUN addgroup -S app \
    && adduser -S app -G app

USER app

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install