# Customers Management

A Spring MVC app for managing customers, that uses the following technologies :
* Spring Boot
* Swagger 
* H2 DB
* React.js
* Rest API/JSON

# Running The Server

## Running The Server Locally
```
git clone https://github.com/razrog/spring-boot-react.git
java -jar spring-boot-react/excutable/docker-spring-boot.jar
```

## Running The Server Docker Image
 - Since there is currently an issue uploading the image to docker-hub
 - here are the instructions on how to build and run the docker image: 

```
1.git clone https://github.com/razrog/spring-boot-react.git
2.cd spring-boot-react
3.docker build -f Dockerfile -t docker-spring-boot-image .
4.docker run -p 8080:8080 docker-spring-boot
```



### Implementations
* React JS

```
http://localhost:8080/
```

* Swagger 

```
http://localhost:8080/swagger-ui.html#/
```

* H2 Console

```
http://localhost:8080/h2-console/login.jsp?jsessionid=c257545db024799ed3fe3be504293bf3
```