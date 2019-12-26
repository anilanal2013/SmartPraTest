FROM openjdk:8-jdk-alpine
LABEL maintainer="anilanal2000@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/SmartPraTest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} SmartPraTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SmartPraTest-0.0.1-SNAPSHOT.jar"]

