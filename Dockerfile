# base image
FROM bellsoft/liberica-openjre-debian:25-cds AS builder

# working directory
WORKDIR /app

# copy files
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 9900

# startup command
ENTRYPOINT ["java", "-jar", "app.jar"]