package com.monopoly.paylode;

import com.monopoly.model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {
    private Long id;
    private String name;
    private int cash;
    private int positionValue;
    private int diceRollingCount;
    private Game game;
}
