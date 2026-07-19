# 🛒 GoCart

GoCart is a RESTful e-commerce backend application built using **Spring Boot**. The project was developed to gain hands-on experience in building secure, scalable backend systems by implementing features commonly found in modern online shopping platforms.

It follows a layered architecture and demonstrates industry-standard backend development practices, including JWT-based authentication, role-based authorization, REST API design, database management with JPA/Hibernate, and image handling.

---

## Features

- Secure user registration and login using JWT authentication
- Role-based authorization with Spring Security
- Product and category management
- Shopping cart with automatic total calculation
- Order placement and order history
- Product image upload and retrieval
- RESTful API design
- Global exception handling
- DTO-based request and response mapping
- Layered architecture (Controller → Service → Repository)

---

## Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java |
| Framework | Spring Boot |
| Security | Spring Security, JWT |
| ORM | Spring Data JPA, Hibernate |
| Database | MySQL |
| Build Tool | Maven |
| Libraries | Lombok, ModelMapper |

---

## Project Structure

```
src/main/java
├── controller
├── service
├── repository
├── model
├── dto
├── request
├── response
├── security
├── exceptions
├── config
└── enums
```

---

## Getting Started

### Clone the repository

```bash
git clone https://github.com/swarrrrn/GoCart.git
```

### Configure the database

Create a MySQL database and update the database credentials in:

```properties
src/main/resources/application.properties
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

The application will be available at:

```
http://localhost:8080
```

---

## Project Highlights

This project demonstrates practical implementation of:

- Spring Boot application development
- JWT Authentication & Authorization
- Spring Security
- RESTful API development
- CRUD operations using Spring Data JPA
- Hibernate ORM
- Entity relationships
- Dependency Injection
- DTO Pattern
- Repository Pattern
- Global Exception Handling
- MySQL database integration

---

## Future Improvements

Some enhancements planned for future versions include:

- Swagger / OpenAPI documentation
- Docker containerization
- Redis caching
- Payment gateway integration
- Email notifications
- Product reviews and ratings
- Wishlist functionality
- Unit and integration testing
- CI/CD pipeline
- Cloud deployment (AWS)

---

## About the Project

GoCart was built as a learning project to understand how a real-world e-commerce backend is designed and implemented. Throughout its development, the focus was on writing clean, modular code while following backend development best practices using the Spring ecosystem.

---

## Author

**Swarn Kumar**

- GitHub: https://github.com/swarrrrn
- LinkedIn: https://www.linkedin.com/in/swarn-kumar/

---

If you have any suggestions or feedback, feel free to open an issue or connect with me. If you found this project helpful, consider giving it a ⭐.
