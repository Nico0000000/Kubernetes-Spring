FROM eclipse-temurin:17-jdk
EXPOSE 8080
ADD target/springboot-application-aws.jar springboot-application-aws.jar
ENTRYPOINT ["java","-jar","/springboot-application-aws.jar","--server.port=8080"]