# Quiz App

## Introduction

**Quiz App** is a web application that provides an online quiz system. The app is developed with a **Java Spring Boot** backend and a **React.js** frontend. Users can log in, select quiz categories, participate in quizzes, and receive scores after completing each quiz.

![Screenshot 1](https://raw.githubusercontent.com/duchuyvo0368/quiz-app/refs/heads/master/image/Screenshot%20(20).png)
![Screenshot 2](https://raw.githubusercontent.com/duchuyvo0368/quiz-app/refs/heads/master/image/Screenshot%20(21).png)
![Screenshot 3](https://raw.githubusercontent.com/duchuyvo0368/quiz-app/refs/heads/master/image/Screenshot%20(22).png)

## Features

- **Login Functionality**: Users can create accounts and log in securely to participate in quizzes.
- **Quiz Categories**: A variety of quiz categories are available for users to choose from.
- **Scoring System**: After completing a quiz, users will receive their score and can track their performance.

## Backend: Java Spring Boot

The backend is built with **Spring Boot**, providing RESTful API endpoints for user authentication, quiz data, and score management. It ensures efficient and secure handling of requests, and interacts with the database to store quiz-related data.

## Frontend: React.js

The frontend is developed with **React.js**, ensuring a responsive and interactive user experience. It communicates with the backend API to fetch quiz data, display questions, and submit answers.

## How to Run the Project

### Backend (Spring Boot)

1. Clone the repository.
2. Navigate to the `backend` folder.
3. Install dependencies and run the project:
   ```bash
   mvn clean install
   mvn spring-boot:run
