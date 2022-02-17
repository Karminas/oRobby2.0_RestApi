FROM openjdk:13
EXPOSE 8080
ADD target/rest-api-docker-test.jar rest-api-docker-test.jar
ENTRYPOINT ["java", "-jar", "/rest-api-docker-test.jar"]