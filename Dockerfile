FROM amazoncorretto:21
LABEL maintainer=jeshupatel
EXPOSE 8083
WORKDIR /app
COPY target/customer-svc.jar /app/customer-svc.jar
ENTRYPOINT ["java","-jar","customer-svc.jar"]