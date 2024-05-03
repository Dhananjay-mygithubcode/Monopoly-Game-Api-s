package com.monopoly.service;

import org.springframework.stereotype.Service;

import com.monopoly.paylode.GameDTO;

@Service
public interface GameService {

    GameDTO createGame(GameDTO gameDTO);
    GameDTO deleteGame(Long gameID);

}
