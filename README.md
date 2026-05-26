# Micro-Services

A Spring Boot based Microservices project demonstrating scalable backend architecture using REST APIs, Spring Data JPA, MySQL, and ModelMapper. This project is built to understand microservice concepts, service communication, and modular backend development.

## Features

- RESTful API development using Spring Boot
- Layered architecture implementation
- Spring Data JPA integration
- MySQL database connectivity
- ModelMapper for DTO mapping
- Employee service implementation
- Maven project structure
- Hibernate ORM support
- Auto table generation using JPA
- DevTools support for development

## Tech Stack

**Backend**
- Java 17
- Spring Boot 3.3.5
- Spring MVC
- Spring Data JPA
- Hibernate

**Database**
- MySQL

**Build Tool**
- Maven

**Utilities**
- ModelMapper
- Spring Boot DevTools

## Project Structure

```bash
microservices-app/
│── src/main/java/com/example/microservice_app
│   ├── config
│   │   └── EmployeeConfig.java
│   ├── controller
│   │   └── EmployeeController.java
│   ├── entity
│   │   └── Employee.java
│   ├── repository
│   │   └── EmployeeRepo.java
│   ├── response
│   │   └── EmployeeResponse.java
│   ├── service
│   │   └── EmployeeService.java
│   └── MicroservicesAppApplication.java
│
└── resources
    └── application.properties
