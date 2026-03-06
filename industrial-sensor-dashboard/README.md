# Industrial Sensor Dashboard (ISD)

## Step 1: Project Folder Structure

```text
industrial-sensor-dashboard/
  backend/
    app/
      main.py
      mqtt_client.py
      modbus_client.py
      websocket_manager.py
      api/
        routes.py
      models/
        sensor.py
    requirements.txt
    Dockerfile
  frontend/
    src/
      components/
        Dashboard.tsx
        SensorCard.tsx
        LiveChart.tsx
      hooks/
        useWebSocket.ts
      App.tsx
    package.json
    Dockerfile
  simulator/
    mqtt_sensor_simulator.py
    modbus_server_simulator.py
    requirements.txt
    Dockerfile
  docker-compose.yml
  README.md
```

## File Purpose (One Sentence Each)

- `backend/app/main.py`: Bootstraps the FastAPI app, middleware, lifecycle events, and route inclusion.
- `backend/app/mqtt_client.py`: Encapsulates MQTT broker connection, topic subscription, and in-memory sensor-state updates.
- `backend/app/modbus_client.py`: Handles async ModbusTCP reads/writes for PLC register polling and control.
- `backend/app/websocket_manager.py`: Maintains active WebSocket clients and broadcasts real-time payloads safely.
- `backend/app/api/routes.py`: Declares REST and WebSocket endpoints consumed by the HMI frontend.
- `backend/app/models/sensor.py`: Defines shared sensor-related Pydantic models and validation contracts.
- `backend/requirements.txt`: Pins backend Python dependencies for repeatable installs.
- `backend/Dockerfile`: Builds the backend container image and starts the FastAPI service.
- `frontend/src/components/Dashboard.tsx`: Composes the core HMI dashboard layout from child widgets.
- `frontend/src/components/SensorCard.tsx`: Renders live sensor KPIs with visual health/alarm indications.
- `frontend/src/components/LiveChart.tsx`: Displays rolling time-series sensor telemetry for trend monitoring.
- `frontend/src/hooks/useWebSocket.ts`: Provides reusable WebSocket connection/reconnect state management.
- `frontend/src/App.tsx`: Wires app-level state, API bootstrap calls, and component composition.
- `frontend/package.json`: Declares frontend scripts and npm dependencies.
- `frontend/Dockerfile`: Builds and runs the frontend containerized runtime.
- `simulator/mqtt_sensor_simulator.py`: Simulates industrial sensors publishing payloads to MQTT topics.
- `simulator/modbus_server_simulator.py`: Simulates a PLC exposing ModbusTCP registers with changing values.
- `simulator/requirements.txt`: Pins simulator Python dependencies.
- `simulator/Dockerfile`: Builds the simulator image used for MQTT and Modbus service containers.
- `docker-compose.yml`: Orchestrates broker, simulators, backend, and frontend as one local stack.
- `README.md`: Documents architecture, setup, operation, and interview/demo guidance.

## Additional Documentation Added

- `INTERVIEW_INSTALLATION_GUIDE.md`: Full Windows laptop setup, run modes, validation commands, troubleshooting, and interview demo flow.
- `PROJECT_DEEP_DIVE.md`: Architecture, protocol responsibilities, reliability notes, and extension roadmap.
- `SCREENSHOTS_INDEX.html`: Shareable screenshot gallery template for project visuals.
- `SCREENSHOTS_SUBMISSION.doc`: Checklist-style document for preparing and sharing screenshot packs.
- `screenshots/README.md`: Naming convention and placement guide for screenshot assets.
