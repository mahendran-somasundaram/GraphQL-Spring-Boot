**GraphQL Spring Boot CRUD Application**

This is a simple CRUD (Create, Read, Update, Delete) application built with Spring Boot and GraphQL. GraphQL is a query language for APIs that provides a more efficient, powerful, and flexible alternative to REST. In GraphQL, clients can specify exactly what data they need, which reduces over-fetching and under-fetching of data.
Introduction

This application showcases how to implement a CRUD functionality using GraphQL and Spring Boot. It demonstrates how to define GraphQL schemas, handle incoming requests, implement business logic, and interact with a database to perform CRUD operations.
Installation

To run this application locally, follow these steps:
Clone the repository:
git clone https://github.com/mahendran-somasundaram/your-repository.git
Navigate to the project directory:
cd your-repository
Build the project using Maven:
mvn clean install
Run the application:
mvn spring-boot:run
The application will start running on http://localhost:8080.
Implemented Features
Controller

The controller package contains classes responsible for handling incoming HTTP requests and routing them to the appropriate service. In this application, the controllers expose GraphQL endpoints to interact with the data.
Model

The model package contains entity classes representing the data structure of the application. In particular, the Player class represents individual players and includes attributes such as name (String), id (Integer), and team (Enum Team). The Team enum class defines different team names.
Service

The service package contains service classes implementing the business logic for CRUD operations. Each service class handles operations such as creating, reading, updating, and deleting player data.
Resources

The resources directory contains GraphQL schemas defining the API structure. The schemas define the types and operations available in the GraphQL API. Clients can use these schemas to understand how to interact with the API.
Usage

To interact with the GraphQL API, you can use tools like GraphiQL or Postman. Here are some sample GraphQL queries and mutations you can try:
# Query to retrieve all players
type Player{
    id:ID
    name:String
    team:String
}

type Query{
    findAll:[Player]
    findOne(id:ID): Player
}


# Mutation to create, update and delete the player
type Mutation{
    create(name:String,team:String): Player
    update(id:ID,name:String,team:String):Player
    delete(id:ID):Player
}
Feel free to explore and interact with the GraphQL API using these queries and mutations.
Development

This section can include information about the development environment, such as IDE setup, dependencies, and any other tools required for development.
Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:

    Fork the repository
    Create a new branch for your feature or fix
    Make your changes and test them thoroughly
    Submit a pull request describing your changes
