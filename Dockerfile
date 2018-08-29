FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/spring-boot-callme-2.0-SNAPSHOT.jar
COPY ${JAR_FILE} /spring-boot-callme-2.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-callme-2.0-SNAPSHOT.jar"]