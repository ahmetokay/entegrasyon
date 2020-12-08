#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
#
##
## Package stage
##
FROM openjdk:8-jre-alpine3.9
COPY --from=build /home/app/target/nvi-kimlik-dogrulama-1.0-SNAPSHOT-spring-boot.jar /nvi-kimlik-dogrulama.jar
EXPOSE 5555
ENTRYPOINT ["java","-jar","/nvi-kimlik-dogrulama.jar"]




## we will use openjdk 8 with alpine as it is a very small linux distro
#FROM openjdk:8-jre-alpine3.9
#
## copy the packaged jar file into our docker image
#COPY nvi-kimlik-dogrulama/target/nvi-kimlik-dogrulama-1.0-SNAPSHOT-spring-boot.jar /nvi-kimlik-dogrulama.jar
#
## set the startup command to execute the jar
#CMD ["java", "-jar", "/nvi-kimlik-dogrulama.jar"]