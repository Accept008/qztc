FROM openjdk:8-jdk-alpine
MAINTAINER chenjiacheng <chenjiacheng@soundbus.cn>

VOLUME /tmp

ARG JAR_FILE=target/use-custom-start.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
