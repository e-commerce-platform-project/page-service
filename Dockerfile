FROM openjdk:17-alpine
WORKDIR /app
RUN apk add --no-cache curl
COPY target/page-service-0.0.1-SNAPSHOT.jar /app/page-service.jar
ENTRYPOINT ["java", "-jar", "page-service.jar"]