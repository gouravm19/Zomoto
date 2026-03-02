# API Reference (Baseline)

## Auth (Implemented baseline in user-service)
- `POST /api/v1/auth/send-otp`
  - Validates E.164 phone format.
  - Returns masked phone with success message.
- `POST /api/v1/auth/verify-otp`
  - Validates phone + 6-digit OTP.
  - Returns token response contract.

## Users (Planned)
- `GET /api/v1/users/me`
- `PUT /api/v1/users/me`
- `GET /api/v1/users/me/addresses`
- `POST /api/v1/users/me/addresses`

## Restaurants (Planned)
- `GET /api/v1/restaurants`
- `GET /api/v1/restaurants/{restaurantId}`
- `POST /api/v1/restaurants/{restaurantId}/reviews`

## Orders & Cart (Planned)
- `GET /api/v1/cart`
- `POST /api/v1/cart/items`
- `POST /api/v1/orders`
- `GET /api/v1/orders/{orderId}`
- `POST /api/v1/orders/{orderId}/cancel`
