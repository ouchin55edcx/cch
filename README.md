<div align="center">

# CCH - Cycling Competition Management System 🚴‍♂️

![cyl.png](docs/cyl.png)

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Spring](https://img.shields.io/badge/Spring-3.2.0-brightgreen.svg)](https://spring.io/)
[![Hibernate](https://img.shields.io/badge/Hibernate-6.0-darkgreen.svg)](https://hibernate.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Documentation](https://img.shields.io/badge/API-Swagger-85EA2D.svg)](swagger-ui.html)

*A Comprehensive Management System for Time Trial Cycling Competitions*

[Features](#-features) • [API Documentation](#-api-documentation) • [Getting Started](#-getting-started) • [Tech Stack](#-tech-stack)

</div>

## 🎯 Overview

**CCH** (Cyclo Club Horizon) is a robust Spring-based application designed to manage time trial cycling competitions. It provides comprehensive functionality for managing cyclists, competitions, registrations, results, and rankings, making it an essential tool for cycling event organizers.

## ✨ Features

### Core Functionalities
- 🚴‍♂️ **Cyclist Management**
    - Register cyclists with detailed information
    - Update cyclist profiles
    - View and sort cyclists by name, nationality, or team

- 🏆 **Competition Management**
    - Create and organize competitions
    - Manage competition details (name, date, location, distance)
    - Filter competitions by date or location

- 📝 **Registration System**
    - Handle competition registrations
    - Manage participant lists
    - Track registration status

- 📊 **Results & Rankings**
    - Record cyclist times
    - Automatic ranking calculation
    - Individual and cumulative competition rankings

- 📈 **Reporting System**
    - Generate comprehensive competition reports
    - Access historical competition data
    - Track cyclist performance history

## 🔌 API Documentation

### Core Endpoints

#### Team Management
```http
GET    /api/v1/teams            # List all teams
POST   /api/v1/teams            # Create team
GET    /api/v1/teams/{id}       # Get team details
PUT    /api/v1/teams/{id}       # Update team
DELETE /api/v1/teams/{id}       # Remove team
```

#### Cyclist Management
```http
GET    /api/v1/cyclists         # List all cyclists
POST   /api/v1/cyclists         # Register cyclist
GET    /api/v1/cyclists/{id}    # Get cyclist details
PUT    /api/v1/cyclists/{id}    # Update cyclist
DELETE /api/v1/cyclists/{id}    # Remove cyclist
```

#### Competition & Results
```http
GET    /api/v1/competitions     # List competitions
POST   /api/v1/competitions     # Create competition
GET    /api/v1/general-results  # View rankings
POST   /api/v1/stage-results    # Record stage results
```

## 🛠️ Tech Stack

### Core Technologies
- **Backend Framework**
    - Java 17+
    - Spring Framework
    - Spring MVC
    - Hibernate/JPA
    - Spring IoC Container

- **Testing Tools**
    - JUnit
    - Mockito
    - TDD Approach

- **Development Tools**
    - ModelMapper/MapStruct
    - Postman
    - Tomcat Server

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Your preferred IDE
- Postman (for API testing)

### Installation

1. **Clone the Repository**
```bash
git clone [repository-url]
cd cch-system
```

2. **Configure Database**
```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/cch
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. **Build and Run**
```bash
# Build the project
mvn clean install

# Start the application
mvn spring-boot:run
```

## 🧪 Testing

### Running Tests
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=CyclistServiceTest
```

## 📚 Documentation

Full API documentation is available at:
```
http://localhost:8080/swagger-ui.html
```

## 🤝 Contributing

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<div align="center">

Created with ❤️ by ouchin55edcx

</div>