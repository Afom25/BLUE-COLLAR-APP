FROM openjdk:11-oracle

ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8085
ENTRYPOINT["java", "-jar", "spring-boot-docker.jar"]

