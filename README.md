# Student Management System

A simple yet efficient **Student Management System** built using **Spring Boot, Thymeleaf, Spring JPA, and H2 Database**. This project provides a web-based interface to manage student records, including adding, editing, deleting, and viewing student details.

## Features
- Add new students with first name, last name, and email
- View a list of all students in a tabular format
- Update student details
- Delete student records
- User-friendly Bootstrap-based UI
- Uses H2 in-memory database for easy setup

## Technologies Used
- **Java** (Spring Boot)
- **Spring Web & Spring Data JPA**
- **Thymeleaf** (for dynamic HTML rendering)
- **H2 Database** (in-memory database for quick prototyping)
- **Bootstrap 5** (for styling and responsive UI)

## Installation & Setup
### Prerequisites
- JDK 17+
- Maven
- Git

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/student-management-system.git
   cd student-management-system
   ```
2. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```
3. Open the application in a browser:
   ```
   http://localhost:8080/students
   ```
## Project Demo

https://github.com/user-attachments/assets/6843cc08-f4b2-49ee-b02e-e05859e3210c

## API Endpoints
| HTTP Method | Endpoint         | Description          |
|------------|----------------|----------------------|
| GET        | `/students`      | View all students   |
| GET        | `/students/new`  | Add new student form |
| POST       | `/students`      | Save new student    |
| GET        | `/students/edit/{id}` | Edit student form |
| POST       | `/students/{id}` | Update student details |
| GET        | `/students/{id}` | Delete student |

## Folder Structure
```
student-management-system/
│── src/
│   ├── main/
│   │   ├── java/com/example/studentmanagement/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   ├── static/
│   ├── test/
│── pom.xml
│── README.md
```

## Contributing
Contributions are welcome! If you'd like to improve this project, feel free to fork the repository and submit a pull request.

---

Feel free to customize the repository URL and author details!
