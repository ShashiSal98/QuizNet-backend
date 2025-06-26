# QuizNet-backend

This is the backend for the **QuizNet** Exam Portal application, built with Java Spring Boot.

## Features

- User registration and authentication (JWT)
- Role-based access (Admin, User)
- Quiz, Category, and Question management (CRUD)
- MySQL database integration
- RESTful API

## Requirements

- Java 17+
- Maven 3.6+
- MySQL 8+

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ShashiSal98/QuizNet-backend.git
   cd QuizNet-BE
   ```

2. **Configure the database:**
   Edit `src/main/resources/application.properties` with your MySQL credentials:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/exam
   spring.datasource.username=YOUR_USERNAME
   spring.datasource.password=YOUR_PASSWORD
   ```

3. **Build and run:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **API Endpoints:**
   - User: `/user/`
   - Quiz: `/quiz/`
   - Category: `/category/`
   - Question: `/question/`
   - Auth: `/generate-token`, `/current-user`

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- MySQL Connector/J
- JJWT (JWT support)

## License

This project is licensed under the MIT License.


## Author
[Shashi Salwathura](https://github.com/ShashiSal98)

Happy Coding! 🚀

