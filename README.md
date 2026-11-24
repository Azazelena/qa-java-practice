# Java API Automation Testing
## Project Overview
This is a QA portfolio project focused on automated
REST API testing using Java, REST Assured and TestNG.
## Technologies and Tools
- Java
- REST Assured
- TestNG
- Maven
- Jackson (JSON serialization and deserialization)
- Git and GitHub
## Test Coverage
### 1. GET Request — Swagger Petstore
- Endpoint: GET /pet/findByStatus
- Query parameter: status=available
- Expected status code: 200 OK
### 2. POST Request — JSONPlaceholder
- Endpoint: POST /posts
- Expected status code: 201 Created
- Response title validation
- Response body validation
- User ID validation
  ## Project Structure
ApiHomework/
src/test/java/qa/
ApiTests.java
Post.java
pom.xml
## How to Run Tests
Requirements: Java JDK and Maven.
Run the following commands:
cd ApiHomework
mvn test
Skills Demonstrated
REST API automation
HTTP request and response validation
TestNG assertions
JSON serialization and deserialization
Java object mapping
Maven project management
Project Status
Educational QA automation portfolio project.
