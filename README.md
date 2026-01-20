# Advanced DevOps CI/CD Project

This project implements a production-grade CI/CD pipeline for a Java Spring Boot application using GitHub Actions, Docker, and comprehensive security scans.

## Project Overview

- **Application**: Java 17 Spring Boot Web Application
- **Build Tool**: Maven
- **Containerization**: Docker (Multi-stage build)
- **CI/CD**: GitHub Actions
- **Security Check**: Checkstyle, CodeQL (SAST), OWASP Dependency Check (SCA), Trivy (Container Scan)

## CI/CD Pipeline Stages

1.  **Checkout**: Retreives the source code.
2.  **Setup Java**: Configures JDK 17 environment.
3.  **Linting**: Enforces Google coding standards using Checkstyle.
4.  **Unit Tests & Build**: Compiles code and runs JUnit tests.
5.  **SAST**: Scans source code for security vulnerabilities using CodeQL.
6.  **SCA**: Checks dependencies for known CVEs using OWASP Dependency Check.
7.  **Docker Build**: Packages application into a Docker container.
8.  **Image Scan**: Scans the Docker image for OS/library vulnerabilities using Trivy.
9.  **Runtime Smoke Test**: Starts the container and verifies the health endpoint.
10. **Push**: Pushes the verified image to DockerHub.

## How to Run Locally

### Prerequisites
- Java 17+
- Maven
- Docker (optional)

### Build and Run with Maven
```bash
mvn clean package
java -jar target/devops-0.0.1-SNAPSHOT.jar
```
Access the app at `http://localhost:8080/`.

### Build and Run with Docker
```bash
docker build -t devops-project .
docker run -p 8080:8080 devops-project
```

## GitHub Secrets Configuration
To run the pipeline in your fork, set the following Repository Secrets:
- `DOCKERHUB_USERNAME`: Your DockerHub username.
- `DOCKERHUB_TOKEN`: Your DockerHub access token.
