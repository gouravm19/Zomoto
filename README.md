# 🍕 FoodFlow — Food Delivery Platform

[![CI](https://img.shields.io/badge/CI-GitHub_Actions-blue)](#)
[![Java](https://img.shields.io/badge/Java-17-orange)](#)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-green)](#)
[![React](https://img.shields.io/badge/React-18-61dafb)](#)
[![Kafka](https://img.shields.io/badge/Kafka-Event--Driven-black)](#)

Production-grade, microservices-first food delivery platform inspired by Zomato/Swiggy architecture.

## What is now implemented in this repository

- Maven multi-module parent setup.
- Backend service modules for:
  - eureka-server (8761)
  - config-server (8888)
  - api-gateway (8080)
  - user-service (8081)
  - restaurant-service (8082)
  - order-service (8083)
  - payment-service (8084)
  - delivery-service (8085)
  - notification-service (8086)
  - search-service (8087)
- User service API baseline with validated DTOs, Swagger annotations, service abstraction, structured logging and RFC 7807 style validation errors.
- Local infrastructure baseline with Docker Compose + Kafka topic initialization script.

## Architecture

- **Backend**: Spring Boot microservices (User, Restaurant, Order, Payment, Delivery, Notification, Search)
- **Infra**: PostgreSQL, MongoDB, Redis, Kafka, Elasticsearch
- **Gateway**: NGINX + Spring Cloud Gateway
- **Observability**: Prometheus, Grafana, Zipkin
- **Frontend**: React + TypeScript apps for Customer, Restaurant, Delivery, Admin

## Quick Start

```bash
git clone https://github.com/gouravm19/FOOF_DELIVERY_APP.git
cd FOOF_DELIVERY_APP
cp .env.example .env
make start
```

| Service | URL |
|---|---|
| Customer App | http://localhost:3000 |
| Restaurant Portal | http://localhost:3001 |
| Delivery Partner App | http://localhost:3002 |
| Admin Console | http://localhost:3003 |
| API Gateway | http://localhost:8080 |
| Eureka | http://localhost:8761 |
| Kafka UI | http://localhost:8090 |
| Swagger | http://localhost:8080/swagger-ui.html |
| Grafana | http://localhost:3004 |
| MailHog | http://localhost:8025 |

## Repository Layout

```text
backend/
frontend/
docs/
docker-compose.yml
Makefile
pom.xml
```

## Documentation

See [`docs/README.md`](docs/README.md) for complete documentation index.

## Built By

**Gourav Mishra**
Senior Full Stack Developer @ Emerson, Pune
📧 gauravmishra19995@gmail.com
