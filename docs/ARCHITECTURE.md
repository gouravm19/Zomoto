# Architecture Overview

FoodFlow follows an event-driven microservices architecture:

1. API Gateway receives and validates requests.
2. Domain services own isolated data stores.
3. Kafka propagates domain events (`order.created`, `payment.completed`, etc.).
4. Notification/search/analytics consume events asynchronously.

## Current Codebase Baseline

The repository now includes a runnable **Maven multi-module** backend scaffold with all service modules and independent Spring Boot entry points. This enables service-by-service implementation while maintaining consistent dependency management and build lifecycle.

## Service Responsibilities
- **user-service**: OTP auth, profile, address, refresh token lifecycle.
- **restaurant-service**: onboarding, menus, reviews.
- **order-service**: cart lifecycle, order FSM, coupon application.
- **payment-service**: Razorpay order + verification + refunds.
- **delivery-service**: assignment, partner location, tracking.
- **notification-service**: push, SMS, email templates.
- **search-service**: Elasticsearch query and suggestions.

## Reliability
- Idempotency keys for mutation endpoints.
- Outbox/event publishing pattern recommended for exactly-once semantics.
- Dead letter topics for failed event consumption.
- Centralized RFC 7807 ProblemDetail-based error responses per service.
