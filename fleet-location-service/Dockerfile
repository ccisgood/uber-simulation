FROM airhacks/java
COPY target/fleet-location-service.jar /opt/fleet-location-service.jar
ENTRYPOINT ["java","-Xmx512m", "-jar","/opt/fleet-location-service.jar"]
EXPOSE 9000