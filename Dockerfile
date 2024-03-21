FROM eclipse-temurin:17

WORKDIR /app

COPY demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

EXPOSE 4000

ENTRYPOINT ["java", "-jar", "requests-0.0.1-SNAPSHOT.jar"]