package com.nassih.gamesmanager.services.Game;

import com.nassih.gamesmanager.dtos.inputDtos.GameInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.GameOutputDto;

import java.util.List;

public interface GameServices {
    GameOutputDto createGame(GameInputDto gameInputDto);
    List<GameOutputDto> gamesList();
}
