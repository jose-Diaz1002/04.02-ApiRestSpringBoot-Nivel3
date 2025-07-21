# 🍇 S04T02N03 - Fruit CRUD Application with Spring Boot & MongoDB

Welcome to the **Fruit CRUD API** for Level 3! This Spring Boot application demonstrates how to perform CRUD operations persisting data in **MongoDB** — a NoSQL document database.

> 🚀 _An advanced project from IT Academy's Java backend curriculum leveraging MongoDB and Spring Data MongoDB._

---

## 🔧 Project Setup

Generated via [Spring Initializr](https://start.spring.io/) with these settings:

| Setting              | Value                             |
|----------------------|-----------------------------------|
| Project              | Maven or Gradle                   |
| Language             | Java                              |
| Spring Boot Version  | ✅ Latest stable release           |
| Group                | `cat.itacademy.s04.t02.n03`       |
| Artifact             | `S04T02N03`                       |
| Name                 | `S04T02N03`                       |
| Description          | `S04T02N03`                       |
| Packaging            | Jar                               |
| Java Version         | 11 or higher                      |

### 📦 Dependencies

- ✅ Spring Boot DevTools  
- 🌐 Spring Web  
- 🍃 Spring Data MongoDB  

---

## 🗂️ Project Structure

```plaintext
src/main/java/cat/itacademy/s04/t02/n03/
    ├── controllers    # Handles HTTP requests & responses
    ├── model          # Defines the Fruit entity/document
    ├── repository     # MongoDB repositories (extends MongoRepository)
    ├── services       # Business logic and operations
    └── exception      # Custom exception handlers
