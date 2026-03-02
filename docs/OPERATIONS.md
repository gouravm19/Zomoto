# Operations

## Start stack
```bash
make start
```

## Logs
```bash
make logs
```

## Stop stack
```bash
make stop
```

## Health checks
- Gateway: `GET /actuator/health`
- Prometheus: `http://localhost:9090`
- Grafana: `http://localhost:3004`
