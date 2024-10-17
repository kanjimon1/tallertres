# Stage 1: Build the application
FROM maven:3.8-openjdk-17-slim AS build

# Set the working directory
WORKDIR /home/app

# Copy the project files
COPY . .

# Build the project without running tests
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-slim

# Create a directory for the application
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /home/app/target/*.jar /app/spring-boot-application.jar

# Expose port 8080
EXPOSE 8080

# Define the entry point
ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar"]