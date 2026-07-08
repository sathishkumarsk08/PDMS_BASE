FROM eclipse-temurin:11-jre

WORKDIR /app

COPY target/pms_v1.war pms_v1.war

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/pms_v1.war"]
