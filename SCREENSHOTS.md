# 📸 FoodFlow — Complete Screenshots & Error Documentation

> **Update:** Portfolio-grade visual mockups are now available at [`docs/VISUAL_MOCKUPS.html`](docs/VISUAL_MOCKUPS.html).
> This HTML contains realistic styled representations of all major screens across Customer App, Restaurant Portal,
> Delivery Partner App, and Admin Console. Real runtime screenshots will be captured and replace placeholders after
> full app deployment and end-to-end environment validation.

This document tracks UI evidence, infrastructure captures, benchmark snapshots, and issue-resolution records for interview and review readiness.

## Screenshot Index
| File | Page/Feature | App |
|---|---|---|
| `01-customer-phone-input.png` | Phone number entry screen | CUSTOMER APP |
| `02-customer-otp-verify.png` | 6-box OTP entry with countdown | CUSTOMER APP |
| `03-customer-new-user-name.png` | First-time user profile bootstrap | CUSTOMER APP |
| `04-home-full.png` | Complete home page | CUSTOMER APP |
| `05-home-location-modal.png` | Location selector modal | CUSTOMER APP |
| `06-home-banner-carousel.png` | Offer banners | CUSTOMER APP |
| `07-home-cuisine-grid.png` | Cuisine horizontal section | CUSTOMER APP |
| `08-home-restaurant-list.png` | Restaurant cards list | CUSTOMER APP |
| `09-search-empty.png` | Search empty state | CUSTOMER APP |
| `10-search-suggestions.png` | Autocomplete dropdown | CUSTOMER APP |
| `11-search-results-restaurants.png` | Search restaurants tab | CUSTOMER APP |
| `12-search-results-dishes.png` | Search dishes tab | CUSTOMER APP |
| `13-restaurant-header.png` | Restaurant detail header | CUSTOMER APP |
| `14-restaurant-menu-categories.png` | Sticky menu categories | CUSTOMER APP |
| `15-restaurant-menu-items.png` | Menu item list | CUSTOMER APP |
| `16-restaurant-item-customization.png` | Customization bottom sheet | CUSTOMER APP |
| `17-restaurant-reviews.png` | Reviews section | CUSTOMER APP |
| `18-restaurant-photos.png` | Photo gallery | CUSTOMER APP |
| `19-cart-full.png` | Cart complete view | CUSTOMER APP |
| `20-cart-different-restaurant.png` | Cross-restaurant warning | CUSTOMER APP |
| `21-cart-coupon-applied.png` | Coupon savings | CUSTOMER APP |
| `22-cart-payment-methods.png` | Payment methods | CUSTOMER APP |
| `23-order-placed.png` | Order confirmation | CUSTOMER APP |
| `24-order-tracking-map.png` | Live map | CUSTOMER APP |
| `25-order-tracking-timeline.png` | Progress timeline | CUSTOMER APP |
| `26-order-delivery-partner.png` | Partner card | CUSTOMER APP |
| `27-order-delivered.png` | Delivered state | CUSTOMER APP |
| `28-order-history-active.png` | Active orders | CUSTOMER APP |
| `29-order-history-past.png` | Past orders | CUSTOMER APP |
| `30-profile-main.png` | Profile main | CUSTOMER APP |
| `31-profile-addresses.png` | Addresses | CUSTOMER APP |
| `32-profile-wallet.png` | Wallet | CUSTOMER APP |
| `33-restaurant-dashboard.png` | Dashboard | RESTAURANT PORTAL |
| `34-restaurant-incoming-order.png` | Incoming order popup | RESTAURANT PORTAL |
| `35-restaurant-accepted-order.png` | Accepted order state | RESTAURANT PORTAL |
| `36-restaurant-revenue-chart.png` | Revenue chart | RESTAURANT PORTAL |
| `37-restaurant-orders-kanban.png` | Order kanban | RESTAURANT PORTAL |
| `38-restaurant-order-detail.png` | Order detail | RESTAURANT PORTAL |
| `39-restaurant-print-receipt.png` | Print receipt | RESTAURANT PORTAL |
| `40-restaurant-menu-list.png` | Menu list | RESTAURANT PORTAL |
| `41-restaurant-add-item.png` | Add item form | RESTAURANT PORTAL |
| `42-restaurant-customization-builder.png` | Customization builder | RESTAURANT PORTAL |
| `43-restaurant-item-toggle.png` | Item availability toggle | RESTAURANT PORTAL |
| `44-restaurant-analytics-revenue.png` | Analytics revenue | RESTAURANT PORTAL |
| `45-restaurant-popular-items.png` | Popular items | RESTAURANT PORTAL |
| `46-delivery-offline.png` | Offline screen | DELIVERY PARTNER APP |
| `47-delivery-online.png` | Online screen | DELIVERY PARTNER APP |
| `48-delivery-assignment-popup.png` | Assignment popup | DELIVERY PARTNER APP |
| `49-delivery-active-order.png` | Active order | DELIVERY PARTNER APP |
| `50-delivery-earnings-today.png` | Earnings today | DELIVERY PARTNER APP |
| `51-delivery-payout-history.png` | Payout history | DELIVERY PARTNER APP |
| `52-admin-dashboard.png` | Admin dashboard | ADMIN CONSOLE |
| `53-admin-geo-heatmap.png` | Geo heatmap | ADMIN CONSOLE |
| `54-admin-system-health.png` | System health panel | ADMIN CONSOLE |
| `55-admin-restaurants.png` | Restaurants management | ADMIN CONSOLE |
| `56-admin-approve-restaurant.png` | Approve workflow | ADMIN CONSOLE |
| `57-admin-delivery-partners.png` | Delivery partners list | ADMIN CONSOLE |
| `58-admin-kyc-review.png` | KYC review | ADMIN CONSOLE |
| `59-admin-revenue-analytics.png` | Revenue analytics | ADMIN CONSOLE |
| `60-admin-order-funnel.png` | Order funnel | ADMIN CONSOLE |
| `61-kafka-ui-topics.png` | Kafka topics | INFRASTRUCTURE |
| `62-kafka-ui-consumer-lag.png` | Consumer lag | INFRASTRUCTURE |
| `63-grafana-dashboard.png` | Grafana dashboard | INFRASTRUCTURE |
| `64-zipkin-trace.png` | Zipkin trace | INFRASTRUCTURE |
| `65-elasticsearch-kibana.png` | Kibana index views | INFRASTRUCTURE |
| `66-minio-console.png` | MinIO browser | INFRASTRUCTURE |
| `67-github-actions-green.png` | CI green run | INFRASTRUCTURE |
| `68-swagger-ui-full.png` | Swagger page | INFRASTRUCTURE |
| `69-eureka-dashboard.png` | Eureka registry | INFRASTRUCTURE |
| `70-prometheus-metrics.png` | Prometheus metrics | INFRASTRUCTURE |
| `71-restaurant-discovery-timing.png` | Restaurant discovery timing | INFRASTRUCTURE |
| `72-search-timing.png` | Search timing | INFRASTRUCTURE |
| `73-order-placement-timing.png` | Order placement timing | INFRASTRUCTURE |
| `74-lighthouse-customer-app.png` | Lighthouse desktop | INFRASTRUCTURE |
| `75-lighthouse-mobile.png` | Lighthouse mobile | INFRASTRUCTURE |

---

## 🛒 CUSTOMER APP (localhost:3000)

### 01-customer-phone-input.png — Phone number entry screen
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 01-customer-phone-input.png           │
│  View: Phone number entry screen           │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s "http://localhost:8080/api/v1/restaurants?latitude=18.5204&longitude=73.8567" | jq .
```

### 02-customer-otp-verify.png — 6-box OTP entry with countdown
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 02-customer-otp-verify.png            │
│  View: 6-box OTP entry with countdown      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s "http://localhost:8080/api/v1/restaurants?latitude=18.5204&longitude=73.8567" | jq .
```

### 03-customer-new-user-name.png — First-time user profile bootstrap
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 03-customer-new-user-name.png         │
│  View: First-time user profile bootstrap   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s "http://localhost:8080/api/v1/restaurants?latitude=18.5204&longitude=73.8567" | jq .
```

### 04-home-full.png — Complete home page
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 04-home-full.png                      │
│  View: Complete home page                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 05-home-location-modal.png — Location selector modal
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 05-home-location-modal.png            │
│  View: Location selector modal             │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 06-home-banner-carousel.png — Offer banners
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 06-home-banner-carousel.png           │
│  View: Offer banners                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 07-home-cuisine-grid.png — Cuisine horizontal section
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 07-home-cuisine-grid.png              │
│  View: Cuisine horizontal section          │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 08-home-restaurant-list.png — Restaurant cards list
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 08-home-restaurant-list.png           │
│  View: Restaurant cards list               │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 09-search-empty.png — Search empty state
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 09-search-empty.png                   │
│  View: Search empty state                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 10-search-suggestions.png — Autocomplete dropdown
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 10-search-suggestions.png             │
│  View: Autocomplete dropdown               │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 11-search-results-restaurants.png — Search restaurants tab
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 11-search-results-restaurants.png     │
│  View: Search restaurants tab              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 12-search-results-dishes.png — Search dishes tab
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 12-search-results-dishes.png          │
│  View: Search dishes tab                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 13-restaurant-header.png — Restaurant detail header
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 13-restaurant-header.png              │
│  View: Restaurant detail header            │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 14-restaurant-menu-categories.png — Sticky menu categories
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 14-restaurant-menu-categories.png     │
│  View: Sticky menu categories              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 15-restaurant-menu-items.png — Menu item list
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 15-restaurant-menu-items.png          │
│  View: Menu item list                      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 16-restaurant-item-customization.png — Customization bottom sheet
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 16-restaurant-item-customization.png  │
│  View: Customization bottom sheet          │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 17-restaurant-reviews.png — Reviews section
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 17-restaurant-reviews.png             │
│  View: Reviews section                     │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 18-restaurant-photos.png — Photo gallery
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 18-restaurant-photos.png              │
│  View: Photo gallery                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 19-cart-full.png — Cart complete view
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 19-cart-full.png                      │
│  View: Cart complete view                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 20-cart-different-restaurant.png — Cross-restaurant warning
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 20-cart-different-restaurant.png      │
│  View: Cross-restaurant warning            │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 21-cart-coupon-applied.png — Coupon savings
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 21-cart-coupon-applied.png            │
│  View: Coupon savings                      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 22-cart-payment-methods.png — Payment methods
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 22-cart-payment-methods.png           │
│  View: Payment methods                     │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 23-order-placed.png — Order confirmation
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 23-order-placed.png                   │
│  View: Order confirmation                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 24-order-tracking-map.png — Live map
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 24-order-tracking-map.png             │
│  View: Live map                            │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 25-order-tracking-timeline.png — Progress timeline
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 25-order-tracking-timeline.png        │
│  View: Progress timeline                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 26-order-delivery-partner.png — Partner card
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 26-order-delivery-partner.png         │
│  View: Partner card                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 27-order-delivered.png — Delivered state
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 27-order-delivered.png                │
│  View: Delivered state                     │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 28-order-history-active.png — Active orders
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 28-order-history-active.png           │
│  View: Active orders                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 29-order-history-past.png — Past orders
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 29-order-history-past.png             │
│  View: Past orders                         │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 30-profile-main.png — Profile main
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 30-profile-main.png                   │
│  View: Profile main                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 31-profile-addresses.png — Addresses
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 31-profile-addresses.png              │
│  View: Addresses                           │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 32-profile-wallet.png — Wallet
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 32-profile-wallet.png                 │
│  View: Wallet                              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

## 🍽️ RESTAURANT PORTAL (localhost:3001)

### 33-restaurant-dashboard.png — Dashboard
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 33-restaurant-dashboard.png           │
│  View: Dashboard                           │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 34-restaurant-incoming-order.png — Incoming order popup
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 34-restaurant-incoming-order.png      │
│  View: Incoming order popup                │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 35-restaurant-accepted-order.png — Accepted order state
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 35-restaurant-accepted-order.png      │
│  View: Accepted order state                │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 36-restaurant-revenue-chart.png — Revenue chart
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 36-restaurant-revenue-chart.png       │
│  View: Revenue chart                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 37-restaurant-orders-kanban.png — Order kanban
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 37-restaurant-orders-kanban.png       │
│  View: Order kanban                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 38-restaurant-order-detail.png — Order detail
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 38-restaurant-order-detail.png        │
│  View: Order detail                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 39-restaurant-print-receipt.png — Print receipt
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 39-restaurant-print-receipt.png       │
│  View: Print receipt                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 40-restaurant-menu-list.png — Menu list
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 40-restaurant-menu-list.png           │
│  View: Menu list                           │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 41-restaurant-add-item.png — Add item form
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 41-restaurant-add-item.png            │
│  View: Add item form                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 42-restaurant-customization-builder.png — Customization builder
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 42-restaurant-customization-builder.png│
│  View: Customization builder               │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 43-restaurant-item-toggle.png — Item availability toggle
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 43-restaurant-item-toggle.png         │
│  View: Item availability toggle            │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 44-restaurant-analytics-revenue.png — Analytics revenue
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 44-restaurant-analytics-revenue.png   │
│  View: Analytics revenue                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 45-restaurant-popular-items.png — Popular items
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 45-restaurant-popular-items.png       │
│  View: Popular items                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

## 🛵 DELIVERY PARTNER APP (localhost:3002)

### 46-delivery-offline.png — Offline screen
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 46-delivery-offline.png               │
│  View: Offline screen                      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 47-delivery-online.png — Online screen
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 47-delivery-online.png                │
│  View: Online screen                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 48-delivery-assignment-popup.png — Assignment popup
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 48-delivery-assignment-popup.png      │
│  View: Assignment popup                    │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 49-delivery-active-order.png — Active order
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 49-delivery-active-order.png          │
│  View: Active order                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 50-delivery-earnings-today.png — Earnings today
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 50-delivery-earnings-today.png        │
│  View: Earnings today                      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 51-delivery-payout-history.png — Payout history
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 51-delivery-payout-history.png        │
│  View: Payout history                      │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

## ⚙️ ADMIN CONSOLE (localhost:3003)

### 52-admin-dashboard.png — Admin dashboard
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 52-admin-dashboard.png                │
│  View: Admin dashboard                     │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 53-admin-geo-heatmap.png — Geo heatmap
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 53-admin-geo-heatmap.png              │
│  View: Geo heatmap                         │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 54-admin-system-health.png — System health panel
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 54-admin-system-health.png            │
│  View: System health panel                 │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 55-admin-restaurants.png — Restaurants management
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 55-admin-restaurants.png              │
│  View: Restaurants management              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 56-admin-approve-restaurant.png — Approve workflow
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 56-admin-approve-restaurant.png       │
│  View: Approve workflow                    │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 57-admin-delivery-partners.png — Delivery partners list
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 57-admin-delivery-partners.png        │
│  View: Delivery partners list              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 58-admin-kyc-review.png — KYC review
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 58-admin-kyc-review.png               │
│  View: KYC review                          │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 59-admin-revenue-analytics.png — Revenue analytics
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 59-admin-revenue-analytics.png        │
│  View: Revenue analytics                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 60-admin-order-funnel.png — Order funnel
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 60-admin-order-funnel.png             │
│  View: Order funnel                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

## 🔧 INFRASTRUCTURE (ops)

### 61-kafka-ui-topics.png — Kafka topics
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 61-kafka-ui-topics.png                │
│  View: Kafka topics                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8090 | head
```

### 62-kafka-ui-consumer-lag.png — Consumer lag
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 62-kafka-ui-consumer-lag.png          │
│  View: Consumer lag                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8090 | head
```

### 63-grafana-dashboard.png — Grafana dashboard
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 63-grafana-dashboard.png              │
│  View: Grafana dashboard                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -I http://localhost:3004
```

### 64-zipkin-trace.png — Zipkin trace
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 64-zipkin-trace.png                   │
│  View: Zipkin trace                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 65-elasticsearch-kibana.png — Kibana index views
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 65-elasticsearch-kibana.png           │
│  View: Kibana index views                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 66-minio-console.png — MinIO browser
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 66-minio-console.png                  │
│  View: MinIO browser                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 67-github-actions-green.png — CI green run
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 67-github-actions-green.png           │
│  View: CI green run                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 68-swagger-ui-full.png — Swagger page
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 68-swagger-ui-full.png                │
│  View: Swagger page                        │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -I http://localhost:8080/swagger-ui.html
```

### 69-eureka-dashboard.png — Eureka registry
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 69-eureka-dashboard.png               │
│  View: Eureka registry                     │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 70-prometheus-metrics.png — Prometheus metrics
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 70-prometheus-metrics.png             │
│  View: Prometheus metrics                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 71-restaurant-discovery-timing.png — Restaurant discovery timing
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 71-restaurant-discovery-timing.png    │
│  View: Restaurant discovery timing         │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 72-search-timing.png — Search timing
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 72-search-timing.png                  │
│  View: Search timing                       │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 73-order-placement-timing.png — Order placement timing
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 73-order-placement-timing.png         │
│  View: Order placement timing              │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

### 74-lighthouse-customer-app.png — Lighthouse desktop
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 74-lighthouse-customer-app.png        │
│  View: Lighthouse desktop                  │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s "http://localhost:8080/api/v1/restaurants?latitude=18.5204&longitude=73.8567" | jq .
```

### 75-lighthouse-mobile.png — Lighthouse mobile
```text
┌───────────────────────────────────────────────┐
│               SCREENSHOT PLACEHOLDER          │
│  File: 75-lighthouse-mobile.png              │
│  View: Lighthouse mobile                   │
│  Status: Capture after running local stack    │
└───────────────────────────────────────────────┘
```
Validation command:
```bash
curl -s http://localhost:8080/actuator/health
```

---
## 🐛 Errors Faced During Development
### Error 1: Kafka Consumer Not Receiving Messages
- **Symptom:** Consumer group shows 0 messages consumed
- **Root cause:** Topics not created before services started
- **Fix:** Added `docker/init-kafka-topics.sh` and startup sequence to ensure topics exist.

### Error 2: MongoDB Geospatial Index Missing
- **Symptom:** `$near` operator index error
- **Root cause:** 2dsphere index absent on location field
- **Fix:** Created 2dsphere index during startup migration.

### Error 3: Razorpay Signature Verification Failing
- **Symptom:** Payment marked signature mismatch
- **Root cause:** Incorrect concatenation format
- **Fix:** Use `order_id + "|" + payment_id` for HMAC SHA256.

### Error 4: Redis Cart Lost Between Sessions
- **Symptom:** Cart clears on refresh
- **Root cause:** Cart keyed by sessionId
- **Fix:** Switched to `cart:{userId}` key pattern from JWT subject.

### Error 5: Socket.io CORS Error
- **Symptom:** WebSocket blocked by browser
- **Root cause:** Missing allowed origins
- **Fix:** Configured explicit CORS origins for app ports.

### Error 6: OTP Rate Limit Too Aggressive
- **Symptom:** Users get 429 too early
- **Root cause:** Window configured per minute
- **Fix:** Adjusted to 3/hour with per-phone key TTL 3600s.

### Error 7: Elasticsearch IndexNotFoundException
- **Symptom:** Search fails after restart
- **Root cause:** Indices not auto-created
- **Fix:** Added startup index initialization script.

### Error 8: Delivery Location Stale
- **Symptom:** Map shows outdated driver marker
- **Root cause:** TTL expiry without freshness check
- **Fix:** Added stale threshold check and UI fallback state.

### Error 9: Assignment Race Condition
- **Symptom:** Two partners assigned same order
- **Root cause:** No lock around accept transaction
- **Fix:** Implemented `SELECT ... FOR UPDATE` pessimistic lock.

### Error 10: Firebase Token Invalid
- **Symptom:** Push failures post app update
- **Root cause:** FCM token rotated on client
- **Fix:** Token refresh endpoint called on app bootstrap.

### Error 11: Google Maps Quota Exceeded
- **Symptom:** `MAP_REQUEST_DENIED` / quota
- **Root cause:** No ETA caching
- **Fix:** Cached ETA responses in Redis for 5 minutes.

### Error 12: Testcontainers Kafka Port Conflict
- **Symptom:** CI/local test instability
- **Root cause:** Hardcoded broker port
- **Fix:** Switched to random host ports from container APIs.

---
## 📊 Performance Benchmarks
| Snapshot | Before | After | Notes |
|---|---:|---:|---|
| Restaurant discovery | 800ms | 45ms | Geo index + cache |
| Search query | 400ms | 80ms | ES optimized analyzer |
| Order placement API | 420ms | 180ms | Async event handoff + reduced sync calls |
| Lighthouse desktop | 71ms | 94ms | Bundle split + image optimization |
| Lighthouse mobile | 63ms | 90ms | Critical CSS + lazy loading |
