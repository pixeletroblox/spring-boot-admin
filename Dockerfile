FROM adoptopenjdk/openjdk11:ubi
EXPOSE 8080
COPY target/*.jar app.jar
RUN echo "Starting spring boot admin"
CMD ["java", "-jar", "app.jar"]
