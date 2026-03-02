.PHONY: start stop logs test seed clean api-docs kafka-ui db-shell mongo-shell

start:
	docker-compose up --build -d

stop:
	docker-compose down

logs:
	docker-compose logs -f

test:
	@echo "Running backend tests"
	mvn -q test

seed:
	@echo "Seeding initial data"
	docker-compose exec user-service ./seed.sh || true

clean:
	docker-compose down -v

api-docs:
	@echo "Open http://localhost:8080/swagger-ui.html"

kafka-ui:
	@echo "Open http://localhost:8090"

db-shell:
	docker-compose exec postgres psql -U fooddelivery -d fooddelivery

mongo-shell:
	docker-compose exec mongodb mongosh
