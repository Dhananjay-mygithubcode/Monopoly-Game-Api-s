package com.monopoly.paylode;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameDTO {
    private Long id;
    private List<PlayerDTO> players;
    private List<PlaceDTO> places;
}
