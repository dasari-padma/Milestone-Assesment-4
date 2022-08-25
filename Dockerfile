FROM openjdk:17
EXPOSE 8080
ADD /target/Milestone-Assesment-4-0.0.1-SNAPSHOT.jar Milestone-Assesment-4.jar
CMD ["java", "-jar","/Milestone-Assesment-4.jar"]