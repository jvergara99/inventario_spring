# API REST - inventario de productos

API Rest completa para gestionar el inventario de una tienda, construida con Spring Boot, Gradle, Postgres y dockerizada

## Tecnologías
- Spring Boot 3.3.4
- Gradle
- PostgreSQL
- JPA, Hibernate
- Docker, Docker Compose

## Cómo ejecutar localmente

```bash
# 1. Clonar el repositorio
git clone ??????

# 2. Ingresar a la carpeta
cd inventario

# 3. Ejecutar con docker compose
docker compose up --build
```

## Endpoins disponibles
GET --> /app/productos --> Listar todos los productos

| Método  | Endpoint            | Descripción               |
|:------: |:--------------------| --------------------------|
| GET     | /api/productos      | Listar todos los productos|
| GET     | /api/productos/{id} |Obtener producto por id    |
| POST    | /api/productos      | Crear nuevo producto      |
| PUT     | /api/productos/{id} | Actualizar producto       |
| DELETE  | /api/productos/{id} | Actualizar producto       |
