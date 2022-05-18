# Evaluation-1-c

Java web application for college

## About this project

An application to register books and authors

## User functionalities

- Display authors and books

- Books
    - Register and list books

- Authors 
    - Register and list authors

## Instructions

- Import the **create_db** file to get the schema
- The db configuration can be founded in **DbConfig class**

### Change db config

You can go to **DbConfig class** and change the following methods as you like to change db connection, user and password respectively

``` java
.setProperty("hibernate.connection.url","jdbc:mysql://localhost/yourDbLocation?autoReconnect=true&useSSL=false")
.setProperty("hibernate.connection.username","yourUser")
.setProperty("hibernate.connection.password","yourPassword")
```

## Built With
- Java
- Hibernate
- Servlets
- Maven


