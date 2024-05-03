package com.monopoly.paylode;

import com.monopoly.model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDTO {
    private Long id;
    private String name;
    private int buyPrice;
    private int placeDiceValue;
    private Boolean placeSoledStatus;
    private int rent;
    private Game game;
}
