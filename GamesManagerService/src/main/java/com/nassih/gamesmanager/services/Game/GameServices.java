package com.nassih.gamesmanager.services.Game;

import com.nassih.gamesmanager.dtos.inputDtos.GameInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.GameOutputDto;
import com.nassih.gamesmanager.exceptions.custome.InvalidTicketsNumberException;
import com.nassih.gamesmanager.exceptions.custome.MissingFieldsException;

import java.util.List;

public interface GameServices {
    GameOutputDto createGame(GameInputDto gameInputDto) throws MissingFieldsException, InvalidTicketsNumberException;
    List<GameOutputDto> gamesList();
}
