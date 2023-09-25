FROM maven:3.9.3-amazoncorretto-17 AS build

COPY . .

RUN mvn clean package

FROM amazoncorretto:17.0.8

COPY --from=build /target/api.jar .

EXPOSE 8080

ENTRYPOINT java -jar api.jar