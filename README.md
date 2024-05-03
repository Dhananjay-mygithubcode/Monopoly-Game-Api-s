# Monopoly-Game-Api's
This is a simple implementation of the Monopoly game backend using Spring Boot.

About
Monopoly is a multi-player economics-themed board game. In the game, players roll two dice to move around the game board, buying and trading properties, and developing them with houses and hotels. Players collect rent from their opponents, aiming to drive them into bankruptcy.

Description
The project implements the backend logic for a simplified version of the Monopoly game. It includes entities for players, places, and the game itself. Players can buy and sell properties, and the game tracks player positions and balances.

# Installation
Clone the repository:

# git clone <repository-url>
Navigate to the project directory:

# cd monopoly-game
Build the project using Maven:

# mvn clean install
Run the application:

# mvn spring-boot:run
The application will start on http://localhost:8080.

# Usage
You can interact with the backend using RESTful endpoints. Below are some example endpoints:

Create Game: POST /api/create-game/

Create a new game instance with two players.

Get role dice: GET /api/roll-die/{playerId}/{gameId}

Retrieve player information by ID.

Get game status: GET /api/calculate-winner/{gameId}

# Swagger Documentation

Swagger documentation is available at http://localhost:8080/swagger-ui/index.html.
