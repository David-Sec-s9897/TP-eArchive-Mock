# Maven build container 

FROM maven:3.8.5-openjdk-17 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM eclipse-temurin:17

#maintainer 
LABEL maintainer="david.sec@uhk.cz"

#expose port 8080
EXPOSE 8280

#default command
CMD java -jar /data/TP-eArchive-Mock-0.1.0.jar

#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/TP-eArchive-Mock-0.1.0.jar /data/TP-eArchive-Mock-0.1.0.jar
