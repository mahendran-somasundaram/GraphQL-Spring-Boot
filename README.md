# GraphQL Spring Boot CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built with Spring Boot and GraphQL. GraphQL is a query language for APIs 
that provides a more efficient, powerful, and flexible alternative to REST.
In GraphQL, clients can specify exactly what data they need, which reduces over-fetching and under-fetching of data.

## Project Structure

- controller: This package contains classes responsible for handling incoming HTTP requests and routing them to the appropriate service.
   In this application, the controllers expose GraphQL endpoints to interact with the data.
  
- model: This package contains entity classes representing the data structure of the application. In particular, the `Player` class represents
   individual players and includes attributes such as `name` (String), `id` (Integer), and `team` (Enum `Team`). The `Team` enum class defines different team names.
  
- service: This package contains service classes implementing the business logic for CRUD operations. Each service class handles operations such as creating,
    reading, updating, and deleting player data.
  
- resources: This directory contains GraphQL schemas defining the API structure. The schemas define the types and operations available in the GraphQL API.
   Clients can use these schemas to understand how to interact with the API.


