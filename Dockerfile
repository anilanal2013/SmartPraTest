FROM java:8
WORKDIR /
ADD SmartPraTest-0.0.1-SNAPSHOT.jar SmartPraTest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java - jar SmartPraTest-0.0.1-SNAPSHOT.jar
