package com.monopoly.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.paylode.GameDTO;
import com.monopoly.service.GameService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class GameControllers {

    @Autowired
    GameService gameService;

    @PostMapping("/create-game")
    public ResponseEntity<GameDTO> createNewGame(@Valid @RequestBody GameDTO gameDTO) {
        GameDTO savedGame = gameService.createGame(gameDTO);
        return new ResponseEntity<GameDTO>(savedGame, HttpStatus.CREATED);
    }


}
