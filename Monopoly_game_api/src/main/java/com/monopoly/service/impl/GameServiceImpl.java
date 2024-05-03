package com.monopoly.service.impl;

import java.util.Collections;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.monopoly.config.AppConstants;
import com.monopoly.model.Game;
import com.monopoly.model.Place;
import com.monopoly.model.Player;
import com.monopoly.paylode.GameDTO;
import com.monopoly.paylode.PlaceDTO;
import com.monopoly.paylode.PlayerDTO;
import com.monopoly.repository.GameRepo;
import com.monopoly.repository.PlaceRepo;
import com.monopoly.repository.PlayerRepo;
import com.monopoly.service.GameService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepo gameRepo;

    @Autowired
    private PlaceRepo placeRepo;

    @Autowired
    private PlayerRepo playerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GameDTO createGame(GameDTO gameDTO) {

        List<PlayerDTO> playerList = gameDTO.getPlayers();

        Player player1 = modelMapper.map(playerList.get(0), Player.class);
        player1.setCash(AppConstants.PLAYER_STARTING_BALANCE);
        player1.setPositionValue(AppConstants.PLAYER_STARTING_POSITION);
        playerRepo.save(player1);

        Player player2 = modelMapper.map(playerList.get(1), Player.class);
        player2.setCash(AppConstants.PLAYER_STARTING_BALANCE);
        player2.setPositionValue(AppConstants.PLAYER_STARTING_POSITION);
        playerRepo.save(player2);

        List<Place> placeList = placeRepo.findAll().stream().toList();
        gameDTO.setPlaces(Collections.singletonList(modelMapper.map(placeList, PlaceDTO.class)));
        Game game = modelMapper.map(gameDTO , Game.class);
        gameRepo.save(game);
        
        return gameDTO;
    }

    @Override
    public GameDTO deleteGame(Long gameID) {
        return null;
    }
}
