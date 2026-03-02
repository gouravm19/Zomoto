#!/usr/bin/env bash
set -euo pipefail

BROKER=${BROKER:-localhost:9092}

topics=(
  order.created:12
  payment.completed:8
  order.status.updated:12
  delivery.location.updated:24
  order.cancelled:8
  restaurant.updated:4
)

for t in "${topics[@]}"; do
  name="${t%%:*}"
  parts="${t##*:}"
  kafka-topics --bootstrap-server "$BROKER" --create --if-not-exists --topic "$name" --partitions "$parts" --replication-factor 1
  echo "Ensured topic: $name"
done
