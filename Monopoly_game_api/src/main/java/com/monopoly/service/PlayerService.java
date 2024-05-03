package com.monopoly.service;

import org.springframework.stereotype.Service;
import com.monopoly.paylode.PlayerDTO;


@Service
public interface PlayerService {

    Integer getPlayerBalance(Long playerId);
    String roleDice(Long playerId, Long gameId);
    PlayerDTO deletePlayer(Long playerId);
    public String CalculateWinner(Long gameId);
}
