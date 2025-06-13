# HR System API

This is a Human Resources (HR) management system API built with Java and Spring Boot. The project demonstrates a well-structured backend application with features for managing job vacancies and candidates.

## Project Structure

The project follows a clean architecture with the following main directories:

- `services`: Contains business logic and service layer classes
- `entitys`: Defines the data models (Candidates and Vacancies)
- `exceptions`: Custom exception classes
- `DTOs`: Data Transfer Objects for input/output
- `docker`: Docker-related files for containerization
- `controllerAdvice`: Global exception handling
- `repositiry`: Data access layer interfaces
- `controllers`: REST API endpoints

## Key Features

1. CRUD operations for Candidates and Vacancies
2. Assigning Candidates to Vacancies
3. Search functionality for Candidates and Vacancies
4. Error handling with custom exceptions
5. Containerization using Docker
6. PostgreSQL database integration

## Technical Details

- **Framework**: Spring Boot
- **Language**: Java
- **Database**: PostgreSQL
- **Containerization**: Docker
- **API Documentation**: Swagger (OpenAPI)
- **Testing**: JUnit and Mockito

## API Endpoints

- `GET /Vacancies`: Retrieve all vacancies
- `POST /Vacancies`: Create a new vacancy
- `GET /Candidates`: Retrieve all candidates
- `POST /Candidates`: Create a new candidate
- `GET /search/Vacancies`: Search vacancies by name
- `GET /search/candidates`: Search candidates by name
- `POST /asign`: Assign a candidate to a vacancy

## Design Principles and Best Practices

- **SOLID Principles**: The project adheres to SOLID principles, particularly the Single Responsibility Principle (SRP) by separating concerns into different services and controllers.
- **DRY (Don't Repeat Yourself)**: Code duplication is minimized through proper abstraction and modularization.
- **Exception Handling**: Custom exceptions and global exception handling using `@ControllerAdvice` for consistent error responses.
- **DTO Pattern**: Data Transfer Objects are used to decouple the API contract from internal data models.
- **Repository Pattern**: JPA repositories are used for data access abstraction.

## Docker Integration

The `docker` directory contains:
- `Dockerfile`: For building the Java application image
- `docker-compose.yml`: For orchestrating the application and database containers

To run the application using Docker:

cd docker docker-compose up


plainText

## Database

The application uses PostgreSQL, which runs in a Docker container. The connection details can be found in the `application.properties` file.

## Testing

The API is thoroughly tested using JUnit and Mockito. Test cases cover various scenarios including happy paths and error conditions.

## Personal Note

I'm extremely happy with this project as it was entirely conceptualized by me. It provided an excellent opportunity to learn and implement new technologies and best practices. Some key learnings include:

- Containerization with Docker
- Comprehensive error handling
- API testing and validation
- Implementing a clean and scalable project structure

The project structure is comprehensive, including DTOs, controller advice for error handling, custom exceptions, and well-defined entities (Candidates and Vacancies) that form the core of the system.

I'm particularly proud of how I refactored the controllers to respect the Single Responsibility Principle, moving business logic to service classes. This project has been a great learning experience, and I look forward to applying these concepts in future endeavors.

## Getting Started

1. Clone the repository
2. Navigate to the `docker` directory
3. Run `docker-compose up`
4. The API will be available at `http://localhost:8080`

Enjoy exploring the HR System API!