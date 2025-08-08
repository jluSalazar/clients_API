# Spring Boot Cliente API

## Description
RESTful API for managing customer (cliente) information with full CRUD operations. This project provides endpoints to create, read, update and delete customer records, with data persistence in MySQL database.

## Technologies
- Java 17
- Spring Boot
- MySQL 8.0
- Docker
- Docker Compose
- Maven
- Lombok
- Spring Data JPA
- Adminer

## Prerequisites
- Docker Desktop
- Git

## Project Structure
```
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── init.sql
├── docker-compose.yml
├── Dockerfile
└── pom.xml
```

## Getting Started

1. Clone the repository:
```bash
git clone https://github.com/jluSalazar/clients_API.git
cd clients_API
```

2. Start the application using Docker Compose:
```bash
docker compose up --build
```

The application will be available at:
- API: http://localhost:8080
- Adminer (Database Management): http://localhost:8081

## Database Access (Adminer)
1. Open http://localhost:8081
2. Login with:
   - System: MySQL
   - Server: mysqldb
   - Username: root
   - Password: root
   - Database: customers_db

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/api/clientes` | Get all clients |
| GET | `/api/clientes/{id}` | Get client by ID |
| POST | `/api/clientes` | Create new client |
| PUT | `/api/clientes/{id}` | Update client |
| DELETE | `/api/clientes/{id}` | Delete client |

### Example POST Request
```json
{
  "nombre": "John Doe",
  "tipoDocumento": "DNI",
  "numeroDocumento": "12345678",
  "email": "john@example.com",
  "telefono": "123456789",
  "direccion": "123 Main St",
  "ciudad": "City",
  "provincia": "Province",
  "pais": "Country"
}
```

## Stopping the Application
```bash
docker compose down
```

To remove all data including volumes:
```bash
docker compose down -v
```