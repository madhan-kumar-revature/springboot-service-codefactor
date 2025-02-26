# Use Amazon Corretto 21 as the base image
FROM amazoncorretto:21

# Set the working directory inside the container
WORKDIR /app

# Copy the build artifact from your Gradle build to the container
COPY build/libs/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
