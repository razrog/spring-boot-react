FROM openjdk:8
ADD docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar" , "docker-spring-boot.jar"]
