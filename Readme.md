# ✅ To-Do List App

A simple and clean To-Do List web application built with **Spring Boot** and **Thymeleaf**, backed by a **MySQL** database.

---

## 🚀 Features

- Add new tasks
- Mark tasks as completed / uncompleted
- Delete tasks
- Clean and responsive UI with Bootstrap 5

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Backend | Java 17, Spring Boot 4 |
| Frontend | Thymeleaf, HTML, CSS |
| Styling | Bootstrap 5, Bootstrap Icons |
| Database | MySQL |
| ORM | Hibernate / Spring Data JPA |
| Build Tool | Maven |

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/todolistapp/
│   │   ├── controller/
│   │   │   └── TodoController.java   # Handles all HTTP requests
│   │   ├── entity/
│   │   │   └── TodoEntity.java       # Maps to database table
│   │   └── repository/
│   │       └── TodoRepository.java   # Database operations
│   └── resources/
│       ├── templates/
│       │   └── index.html            # Thymeleaf template
│       ├── static/
│       │   └── style.css             # Custom styles
│       ├── application.properties          # Local config (gitignored)
│       └── application.properties.example  # Template for configuration
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL

### Setup

1. **Clone the repository**
```bash
git clone https://github.com/aadish241/To-Do-List-App.git
cd To-Do-List-App
```

2. **Create the database**
```sql
CREATE DATABASE todolistdb;
```

3. **Configure `application.properties`**

> ⚠️ `application.properties` is not included in this repo for security reasons. A template is provided instead.

Copy the example file and fill in your own values:
```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Then edit `application.properties` with your credentials:
```properties
spring.application.name=To-Do-List-App
spring.datasource.url=jdbc:mysql://localhost:3306/todolistdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. **Run the app**
```bash
mvn spring-boot:run
```

5. **Open in browser**
```
http://localhost:8080
```

---


---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Show all todos |
| POST | `/add` | Add a new todo |
| GET | `/update/{id}` | Toggle todo completion |
| GET | `/delete/{id}` | Delete a todo |

---

## 🧠 What I Learned

- Spring Boot MVC architecture
- Thymeleaf templating engine
- Spring Data JPA & Hibernate
- Connecting Spring Boot to MySQL
- Git & GitHub workflow

---

## 👨‍💻 Author

**Aadish** — [@aadish241](https://github.com/aadish241)