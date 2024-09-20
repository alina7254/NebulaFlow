# NebulaFlow — Microservice System for Task, User, and Notification Management

NebulaFlow is a microservice-based web application designed to manage tasks, users, and notifications. 
The project is built using cutting-edge technologies such as Java, Spring Boot, Docker, MySQL, Redis, React, and TailwindCSS. 
The main goal of this project is to demonstrate the ability to develop a complex system using a microservice architecture, 
along with the skills to integrate and work with various modern technologies.


## Key Features

* **User Management:** Registration, authentication, and authorization of users using Spring Security and MySQL for data storage.
* **Task Management**: Create, edit, and delete tasks with support for priority and status management.
* **Notification System**: Real-time notifications powered by Redis and WebSocket.
* **Microservice Architecture**: Each component (users, tasks, notifications) operates as an independent microservice, allowing for easy scalability.
* **Modern Frontend**: The interface is built using React with Vite for fast builds and TailwindCSS for styling, ensuring a responsive and modern user experience.


## Project Objectives

NebulaFlow was created to:
* Demonstrate the ability to develop microservices using Java and Spring Boot.
* Showcase expertise in working with Docker and containerization for service deployment and management.
* Illustrate proficiency in creating REST APIs, integrating frontend and backend, connecting with databases (MySQL, Redis), and working with caching mechanisms.
* Highlight frontend development skills with React and building modern user interfaces.


## Technologies Used

**Backend:**
* Java 11/17: Primary environment for microservice development.
* Spring Boot: Core framework for building REST APIs and handling communication between microservices.
* Spring Data JPA: ORM for managing MySQL databases.
* Spring Security: For user authentication and authorization.
* Redis: For session caching and real-time notifications.
* Docker: Containerization of microservices for easy deployment and scalability.
* H2 Database: Used for development and testing.

**Frontend:**
* React: Library for building the user interface.
* Vite: Fast build tool for frontend development.
* TailwindCSS and DaisyUI: For modern, responsive UI design.
* Axios: For making HTTP requests to the backend REST APIs.


## Microservice Structure

1. **User Management Service:**

* User registration, authentication, and authorization.
* JWT-based security for API protection.
* Data stored in MySQL.

2. **Task Management Service:**

* CRUD operations for managing tasks.
* Ability to sort tasks by status and priority.
* Data stored in MySQL.

3. **Notification Service:**

* Real-time notification system.
* Integration with Redis for notification handling.
* Notifications sent through WebSocket.


## Installation and Setup

**Step 1: Clone the Repository**
`git clone https://github.com/yourusername/nebulaflow.git
cd nebulaflow`

## Step 2: Launch the Microservices with Docker
`docker-compose up --build`

This will start all three microservices (User, Task, Notification) along with MySQL and Redis.

## Step 3: Launch the Frontend
Navigate to the frontend folder and run:

`npm install
npm run dev`

The application will be available at http://localhost:3000.


## Architectural Decisions

NebulaFlow is built on a microservice architecture where each service operates independently, providing high scalability and flexibility. The use of Docker ensures consistency between development and production environments, simplifying deployment.

* **Security:** JWT tokens are used for secure API communication, and passwords are encrypted using BCrypt.
* **Reliability:** Data is persisted in the MySQL relational database, ensuring data integrity.
* **Performance:** Redis is used for caching and handling real-time notifications, optimizing performance.


## Why These Technologies?

* Java and Spring Boot: A powerful combination for building scalable and secure REST APIs. I chose these technologies to showcase backend development proficiency and confident use of Spring Boot.
* React and Vite: Used to create a modern, responsive frontend with fast page load times. The frontend is built with a focus on user experience and adaptability.
* Docker: Ensures consistent environments for both development and production, making microservices easier to deploy and manage.


## Future Development Plans

Currently, the project is actively being developed. Future improvements include:

* Adding chat functionality between users.
* Optimizing the notification system with WebSockets and extending notifications to include email and SMS.
* Developing an API for integration with external services.

## Why This Project Matters to Me

This project allows me to demonstrate my full-stack development skills: from building microservices with Java and Spring Boot to crafting modern user interfaces with React. NebulaFlow is an example of how I can handle complex architectures, choose the right tools for the job, and bring a project to a production-ready state. It’s a project that can solve real-world business problems and scale according to various needs.

## Contact Information

If you have any questions about the project or would like to discuss opportunities, feel free to contact me:

* Email: alya.yarkova.96@gmail.com
* LinkedIn: https://www.linkedin.com/in/levitskaya-alina/


## License

This project is licensed under the MIT License. See the LICENSE file for details.