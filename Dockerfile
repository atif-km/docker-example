# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/my-spring-boot-app.jar .

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variables (optional)
# ENV SPRING_PROFILES_ACTIVE=production

# Run the JAR file as the main application
CMD ["java", "-jar", "my-spring-boot-app.jar"]