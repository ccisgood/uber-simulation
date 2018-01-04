FROM airhacks/java
COPY target/service-location-service.jar /opt/service-location-service.jar
ENTRYPOINT ["java","-Xmx512m", "-jar","/opt/service-location-service.jar"]
EXPOSE 9001