# JobPortal

## What is this
JobPortal is a Spring Boot application that demonstrates stateless JWT authentication and role-based access control.

## Requirements
- Java 11+
- Maven
- Spring Boot

## Quick Start
1. Clone:
   ```bash
   git clone https://github.com/Mahesh756/JobPortal.git
   cd JobPortal
   ```
2. Set environment variables:
   - JWT_SECRET (a strong secret) - for now I hardcoded in the project
3. Run:
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   ```bash
   java -jar target/*.jar
   ```

## Common Endpoints
- POST /api/auth/login — get JWT token
- GET /api/jobs/all — list jobs (may require auth)
- POST /api/jobs — to post the job
- POST /api/applications/apply/{userId}/{jobId} — apply a job


## Contact
if any issues - contact me maheshmaahi67@gmail.com
