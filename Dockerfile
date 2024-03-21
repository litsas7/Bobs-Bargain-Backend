FROM eclipse-temurin:17

WORKDIR /app

COPY requests-0.0.1-SNAPSHOT.jar /app/requests-0.0.1-SNAPSHOT.jar

EXPOSE 4000

ENTRYPOINT ["java", "-jar", "requests-0.0.1-SNAPSHOT.jar"]