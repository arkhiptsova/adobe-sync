FROM maven:3.8-jdk-11 AS image_exec
COPY pom.xml /tmp/
COPY src /tmp/src
WORKDIR /tmp/
RUN mvn package

FROM adoptopenjdk:11-jre
ARG JAR_FILE=*.jar
COPY --from=image_exec /tmp/${JAR_FILE} application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]
