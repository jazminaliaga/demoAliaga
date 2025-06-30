# 🧩 demoAliaga - API Backend Genérica con Spring Boot

Proyecto backend desarrollado en Java con Spring Boot, que implementa una arquitectura genérica para manejar múltiples entidades con operaciones CRUD reutilizables. Pensado como base para sistemas administrativos o APIs REST modulares.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (memoria)
- Maven
- REST API
- Genéricos en controladores y servicios

---

## 📦 Funcionalidades principales

- CRUD completo para las entidades:
  - `Autor`
  - `Libro`
  - `Persona`
  - `Localidad`
  - `Domicilio`

- Arquitectura basada en:
  - Clases abstractas reutilizables (`BaseControllerImpl`, `BaseServiceImpl`)
  - Uso de genéricos para evitar duplicación de código
  - Separación en capas: Controller, Service, Repository, Entity

- Funciones extra:
  - Búsqueda personalizada en `PersonaController` (`/search`, `/searchPaged`)
  - Soporte para paginación (`/paged`)

---

## 🌐 Endpoints disponibles

| Método | URL                             | Descripción                          |
|--------|----------------------------------|--------------------------------------|
| GET    | `/api/v1/personas`              | Listar todas las personas            |
| GET    | `/api/v1/personas/paged`        | Listar personas paginadas            |
| GET    | `/api/v1/personas/search?filtro=texto` | Buscar personas por filtro         |
| POST   | `/api/v1/libros`                | Crear nuevo libro                    |
| PUT    | `/api/v1/autores/{id}`          | Actualizar autor por ID              |
| DELETE | `/api/v1/localidades/{id}`      | Eliminar localidad                   |

---

## ▶️ Cómo ejecutar el proyecto

1. Cloná el repositorio:
   ```bash
   git clone https://github.com/jazminaliaga/demoAliaga.git

2. Abrí el proyecto con IntelliJ, Eclipse o tu IDE favorito.

3. Ejecutá la clase DemoAliagaApplication.java.
