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

# Tests

Service Tests: Tests have been created for the service functions, ensuring their correctness and reliability.
Controller Tests: Tests have been created for the controller functions, verifying their behavior and API responses.

# Swagger Images

![Screenshot 2024-05-03 093752](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/e32b0432-09c4-4deb-ab1d-5c252b4f4268)

![Screenshot 2024-05-03 094224](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/d47cfe59-58ca-44d3-96a3-360009597098)

![Screenshot 2024-05-03 094053](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/5860fd1e-85a6-4756-8f34-e68de23e0a74)

![Screenshot 2024-05-03 094006](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/c62fa9dd-1b34-4ee0-a4bb-821eefbbff5f)

![Screenshot 2024-05-03 093931](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/a92975ba-1886-4e9c-9079-a90d33554767)

![Screenshot 2024-05-03 093841](https://github.com/Dhananjay-mygithubcode/Monopoly-Game-Api-s/assets/145243777/617e2a36-0e7b-41ec-ba95-b5216010b562)

