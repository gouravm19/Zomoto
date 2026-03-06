# Industrial Sensor Dashboard — Deep Project Explanation

## 1. Why This Project Matters
This project models a real industrial telemetry stack where sensor data is event-driven (MQTT), control data is register-driven (ModbusTCP), and operators need live HMI visibility (React + WebSocket).

## 2. End-to-End Data Flow
1. Sensor simulators publish JSON data to MQTT topics (`sensors/temperature`, etc.).
2. Mosquitto broker routes messages to all subscribers.
3. FastAPI backend subscribes to `sensors/#`, parses payloads, stores latest values, and pushes updates via WebSocket.
4. FastAPI polls Modbus registers from PLC simulator and exposes those values via REST.
5. React fetches initial snapshots through REST and receives real-time updates from WebSocket.

## 3. Protocol Responsibilities
- **MQTT**: lightweight pub/sub for high-frequency telemetry with low bandwidth overhead.
- **ModbusTCP**: deterministic register map access for control/status interoperability with PLC ecosystems.
- **WebSocket**: server push to avoid inefficient frontend polling loops.

## 4. How It Mirrors Embedded/Industrial Systems
- Message broker is often edge-local.
- PLC communications are periodic and register-mapped.
- HMI clients subscribe to backend state, not directly to field buses.
- Services are containerized for repeatable deployment and maintenance.

## 5. What You Can Add Next
- Timeseries database persistence.
- Alarm rules and acknowledgment workflows.
- User authorization and command approvals.
- Device twin model and site-level multitenancy.
- Edge-cloud synchronization.

## 6. Reliability Concepts to Discuss in Interview
- Reconnect strategies for MQTT/WebSocket.
- Health endpoints and readiness checks.
- Decoupled ingestion vs presentation.
- Backpressure handling and bounded queues.
- Graceful degradation when external protocols fail.

## 7. Interview Talking Points
- Why protocol choice is use-case driven.
- Why async IO keeps backend responsive.
- How containerization improves reproducibility.
- How to evolve from simulator to real PLC/sensor hardware.
