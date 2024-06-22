FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=kloud4devops-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} kloud4academystudentinternship.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/kloud4academystudentinternship.jar"]