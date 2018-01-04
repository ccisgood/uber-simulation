FROM airhacks/java
COPY target/fleet-location-ingest.jar /opt/fleet-location-ingest.jar
ENTRYPOINT ["java","-Xmx512m", "-jar","/opt/fleet-location-ingest.jar"]
EXPOSE 9006