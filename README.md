# Cluster Offers Systems

`cluster-offers-systems` es un sistema distribuido basado en microservicios diseñado para gestionar productos, marcas y sus relaciones, con una arquitectura limpia, escalable y moderna.

## 🧩 Arquitectura del Proyecto

El sistema está dividido en varios microservicios:

- **offer-ingest-service**: Consume mensajes Kafka con información de productos o marcas y los persiste en una base de datos gráfica (Neo4j).
- **offer-query-service**: Expone consultas internas a la base de datos Neo4j, permitiendo obtener productos, marcas o relaciones entre ellos.
- **offer-api-service**: Microservicio API REST pública que consume datos del `offer-query-service` y los ofrece a través de un endpoint limpio y desacoplado.

## ⚙️ Tecnologías Utilizadas

- Java 21
- Spring Boot 3
- Spring WebFlux (WebClient)
- Kafka
- Neo4j
- Docker (para levantar dependencias como Neo4j o Kafka)
- Git y GitHub para control de versiones
- Maven como gestor de dependencias

## 🧠 Funcionalidades

- Recepción de productos y marcas desde Kafka.
- Almacenamiento en Neo4j con relaciones entre entidades.
- Consultas expuestas por API para acceder a todos los productos.
- Arquitectura basada en DTOs para desacoplar servicios.
- Implementación de relaciones como `RELATED_WITH` o `BELONGS_TO`.

## 🔄 Cómo ejecutar el proyecto

1. Clona el repositorio:
```bash
git clone https://github.com/lucasito0208/cluster-offers-systems.git
cd offer-ingest-service && ./mvnw spring-boot:run
cd offer-query-service && ./mvnw spring-boot:run
cd offer-api-service && ./mvnw spring-boot:run

2. Ejemplo de uso: 

POST /api/productos
[
  {
    "productId": "P1001",
    "productName": "Zapatillas deportivas",
    "price": 59.99,
    "category": "Calzado"
  }
]

```curl <url>
