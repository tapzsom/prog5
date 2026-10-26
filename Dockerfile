# ---- Build stage ----
#Alap image
FROM maven:3.9-eclipse-temurin-25 AS build
#Munkakönyvtár
WORKDIR /app

# Download dependencies first, so this layer is cached until pom.xml changes
COPY pom.xml .
RUN mvn -B dependency:go-offline -Pproduction

COPY src ./src
RUN mvn -B package -Pproduction -DskipTests

# ---- Runtime stage ----
FROM eclipse-temurin:25-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]
