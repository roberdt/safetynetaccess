# Use the official maven/Java 17 image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.9.4-eclipse-temurin-17 AS build-env

# Set the working directory
WORKDIR /app

# Copy only the pom.xml to leverage Docker layer caching
COPY pom.xml ./

# Download all dependencies
RUN mvn dependency:go-offline

# Now copy the source code
COPY src ./src

# Build the application, skipping tests
RUN mvn package -Dmaven.test.skip=true

# Use Google's official Distroless image for Java 17.
# This is a minimal, secure, and reliable base image hosted by Google.
FROM gcr.io/distroless/java17-debian12

# Copy the built JAR from the build-env stage using a wildcard
# This is more resilient to changes in the final JAR name.
COPY --from=build-env /app/target/safety-net-access-*.jar /safety-net-access.jar

# Run the web service on container startup
CMD ["/safety-net-access.jar"]
