package com.nassih.gamesmanager.web;

import com.nassih.gamesmanager.dtos.inputDtos.GameInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.GameOutputDto;
import com.nassih.gamesmanager.exceptions.custome.InvalidTicketsNumberException;
import com.nassih.gamesmanager.exceptions.custome.MissingFieldsException;
import com.nassih.gamesmanager.services.Game.GameServices;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class GameGraphqlController {
    private GameServices gameServices;

    @MutationMapping
    private GameOutputDto addGame(@Argument GameInputDto gameInputDto) throws MissingFieldsException, InvalidTicketsNumberException {
        return gameServices.createGame(gameInputDto);
    }

    @QueryMapping
    private List<GameOutputDto> getGames(){
        return gameServices.gamesList();
    }
}
