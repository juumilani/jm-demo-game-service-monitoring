# Game Service Monitoring Demo

This project is a small Spring Boot application designed to demonstrate
observability, monitoring, and service health in a backend system similar
to those used in online game services.

## Goal

The goal of this project is to showcase:
- Metrics collection (Micrometer)
- Health checks (Spring Boot Actuator)
- Structured logging with request tracing
- Basic service behavior under latency

This reflects real-world concerns such as reliability, debuggability, and
performance in distributed systems at a much smaller scale.

## Tech Stack

- Java 21
- Spring Boot
- Spring Boot Actuator
- Micrometer
- Docker

## Running the Project

Build the project:

    mvn clean package

Run the application:

    java -jar target/demo.jar

## Endpoints

Create player:
    POST /players?name=Julia

Get player:
    GET /players/{id}

Health check:
    GET /actuator/health

Metrics:
    GET /actuator/metrics

## Observability Features

- Request logging with unique request IDs
- Custom metrics for player operations
- Simulated latency to mimic real-world conditions
- Full actuator exposure for monitoring

## Extra Notes

This is a simplified demo and uses in-memory storage. In a production
environment, this would be backed by a database and integrated with
monitoring tools such as Prometheus and Grafana.
