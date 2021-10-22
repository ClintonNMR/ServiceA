FROM openjdk
ADD service1.1.jar /
EXPOSE 8082
CMD ["java","-jar","service1.1.jar"]