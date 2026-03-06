# Industrial Sensor Dashboard (ISD) — Step-by-Step Installation Guide (Windows Laptop)

> This document is written for interview preparation and demo reliability. It explains **exact setup**, **why each dependency exists**, and **how to validate every service**.

---

## 1) What You Are Building

The Industrial Sensor Dashboard (ISD) is a local full-stack Industrial HMI demo with:
- **MQTT sensor simulation** (publish/subscribe pattern)
- **ModbusTCP PLC simulation** (register-based control data)
- **FastAPI backend** (REST + WebSocket bridge)
- **React frontend** (live dashboard)
- **Docker Compose orchestration** (single-command startup)

---

## 2) Windows Prerequisites

Install these tools first:

1. **Git for Windows**
2. **Python 3.11.x**
3. **Node.js 20.x (LTS)**
4. **Docker Desktop (WSL2 backend enabled)**
5. Optional: **VS Code** + extensions (`Python`, `Docker`, `ESLint`)

---

## 3) Install Commands + Verification

### 3.1 Verify Git
```powershell
git --version
```
Expected: a version string like `git version 2.x.x`.

### 3.2 Verify Python 3.11
```powershell
python --version
pip --version
```
Expected: `Python 3.11.x` and pip path/version.

### 3.3 Verify Node.js 20
```powershell
node --version
npm --version
```
Expected: `v20.x.x` for Node and npm version.

### 3.4 Verify Docker Desktop
```powershell
docker --version
docker compose version
docker info
```
Expected: Docker client/server details and compose plugin version.

---

## 4) Clone and Open the Project

```powershell
git clone <YOUR_GITHUB_REPO_URL>
cd <YOUR_REPO_FOLDER>\industrial-sensor-dashboard
```

If repository is already local:
```powershell
cd C:\path\to\repo\industrial-sensor-dashboard
```

---

## 5) Option A (Recommended): Run Entire Stack with Docker

### 5.1 Start all services
```powershell
docker compose up --build
```

### 5.2 Open UI
- Frontend: `http://localhost:3000`
- Backend docs: `http://localhost:8000/docs`

### 5.3 Verify all containers are healthy
```powershell
docker compose ps
```

### 5.4 Stream logs (for interview demo)
```powershell
docker compose logs -f --tail 100
```

### 5.5 Stop all services
```powershell
docker compose down
```

### 5.6 Full cleanup (optional)
```powershell
docker compose down -v --remove-orphans
```

---

## 6) Option B: Manual Run (No Docker)

Open **5 terminals**.

### Terminal 1 — Mosquitto broker
Use Docker-hosted broker quickly:
```powershell
docker run --rm -it -p 1883:1883 eclipse-mosquitto:2
```

### Terminal 2 — Modbus simulator
```powershell
cd simulator
python -m venv .venv
.\.venv\Scripts\activate
pip install -r requirements.txt
python modbus_server_simulator.py
```

### Terminal 3 — MQTT simulator
```powershell
cd simulator
.\.venv\Scripts\activate
python mqtt_sensor_simulator.py
```

### Terminal 4 — FastAPI backend
```powershell
cd backend
python -m venv .venv
.\.venv\Scripts\activate
pip install -r requirements.txt
uvicorn app.main:app --reload --port 8000
```

### Terminal 5 — React frontend
```powershell
cd frontend
npm install
npm start
```

Open:
- Frontend: `http://localhost:3000`
- API docs: `http://localhost:8000/docs`

---

## 7) Required Python Packages (Reference)

Install backend dependencies:
```powershell
pip install fastapi uvicorn paho-mqtt pymodbus websockets python-dotenv pydantic
```

Install simulator dependencies:
```powershell
pip install paho-mqtt pymodbus
```

---

## 8) Quick Functional Validation Checklist (Interview-Safe)

1. **Broker alive**: backend shows successful MQTT subscription.
2. **MQTT simulator publishing**: logs show topics publishing every few seconds.
3. **Modbus simulator alive**: logs show periodic register updates.
4. **Backend reading Modbus**: `/api/plc/registers` returns changing values.
5. **Backend receiving sensors**: `/api/sensors` returns latest MQTT payloads.
6. **WebSocket stream works**: dashboard values update without page refresh.
7. **No hard crash on restart**: stop/start services, verify recovery.

Useful API checks:
```powershell
curl http://localhost:8000/health
curl http://localhost:8000/api/sensors
curl http://localhost:8000/api/plc/registers
```

---

## 9) Troubleshooting (Most Common)

### Port already in use
- 3000, 8000, 1883, 5020 conflicts are common.
```powershell
netstat -ano | findstr :3000
netstat -ano | findstr :8000
netstat -ano | findstr :1883
netstat -ano | findstr :5020
```
Kill conflicting process via Task Manager or `taskkill /PID <pid> /F`.

### Docker not starting
- Ensure WSL2 enabled and Docker Desktop engine running.
- Restart Docker Desktop.

### WebSocket disconnect loop
- Check backend container logs and CORS settings.
- Confirm frontend targets correct backend host/port.

### MQTT messages not arriving
- Verify broker host and port (`localhost:1883` or container DNS name).
- Confirm topic names exactly match subscriber wildcard `sensors/#`.

### Modbus read timeout
- Verify Modbus server bound to expected host/port (`5020`).
- Confirm register addresses used by client exist on simulator.

---

## 10) Interview Demo Flow (2–3 minutes)

1. Show architecture image/diagram.
2. Start with `docker compose up --build`.
3. Open dashboard and show live cards/charts.
4. Show backend Swagger and hit `/api/sensors`.
5. Explain MQTT pub/sub and Modbus register polling.
6. Mention reliability plan (health checks, reconnect logic, containerization).

---

## 11) Security and Production Hardening (What Else You Can Do)

- Enable **MQTT auth + TLS**.
- Add **JWT authentication** for frontend/backend.
- Add **rate limiting** and request validation.
- Use **Prometheus + Grafana** for metrics.
- Persist data to **PostgreSQL/TimescaleDB**.
- Add **alerting rules** (threshold breaches).
- Deploy on **k3s/edge Kubernetes** for embedded Linux gateways.

---

## 12) Beyond This Project (Roadmap)

- Add OPC UA adapter.
- Add historian + trend replay.
- Add user roles (operator/supervisor/admin).
- Add command audit trail for PLC writes.
- Add offline buffering when network fails.
- Add integration tests for MQTT + Modbus pipeline.

---

## 13) GitHub Push Commands

```powershell
git status
git add .
git commit -m "docs: add detailed installation and interview project guides"
git push origin <your-branch-name>
```

If pushing first time from branch:
```powershell
git push -u origin <your-branch-name>
```
