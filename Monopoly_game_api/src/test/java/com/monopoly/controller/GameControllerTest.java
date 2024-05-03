package com.monopoly.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.monopoly.controllers.GameControllers;
import com.monopoly.paylode.GameDTO;
import com.monopoly.service.GameService;


@ExtendWith(MockitoExtension.class)
public class GameControllerTest {
	
	
	@Mock
    private GameService gameService;

    @InjectMocks
    private GameControllers gameControllers;
    

    @Test
    void createNewGame_ValidGameDTO_ReturnsCreatedResponse() {
        GameDTO gameDTO = new GameDTO();
        when(gameService.createGame(gameDTO)).thenReturn(gameDTO);
        ResponseEntity<GameDTO> response = gameControllers.createNewGame(gameDTO);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(gameDTO, response.getBody());
    }

}
