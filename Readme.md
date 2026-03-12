✅ To-Do List App
A simple and clean To-Do List web application built with Spring Boot and Thymeleaf, backed by a MySQL database.

🚀 Features

Add new tasks
Mark tasks as completed / uncompleted
Delete tasks
Clean and responsive UI with Bootstrap 5


🛠️ Tech Stack
LayerTechnologyBackendJava 17, Spring Boot 4FrontendThymeleaf, HTML, CSSStylingBootstrap 5, Bootstrap IconsDatabaseMySQLORMHibernate / Spring Data JPABuild ToolMaven

📁 Project Structure
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
│       └── application.properties   # App configuration

⚙️ Getting Started
Prerequisites

Java 17+
Maven
MySQL

Setup

Clone the repository

bashgit clone https://github.com/aadish241/To-Do-List-App.git
cd To-Do-List-App

Create the database

sqlCREATE DATABASE todolistdb;

Configure application.properties

propertiesspring.datasource.url=jdbc:mysql://localhost:3306/todolistdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Run the app

bashmvn spring-boot:run

Open in browser

http://localhost:8080


📌 API Endpoints
MethodEndpointDescriptionGET/Show all todosPOST/addAdd a new todoGET/update/{id}Toggle todo completionGET/delete/{id}Delete a todo

🧠 What I Learned

Spring Boot MVC architecture
Thymeleaf templating engine
Spring Data JPA & Hibernate
Connecting Spring Boot to MySQL
Git & GitHub workflow


👨‍💻 Author
Aadish — @aadish241