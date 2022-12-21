package com.nassih.gamesmanager.services.Game;

import com.nassih.gamesmanager.dtos.inputDtos.GameInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.GameOutputDto;
import com.nassih.gamesmanager.entities.Game;
import com.nassih.gamesmanager.mappers.MapperService;
import com.nassih.gamesmanager.repositories.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class GameServicesImpl implements GameServices {
    private GameRepository gameRepository;
    private MapperService mapperService;

    @Override
    public GameOutputDto createGame(GameInputDto gameInputDto){
        if (gameInputDto.getDateAndTime() == null || gameInputDto.getAvailableTickets() == null
        || gameInputDto.getStadium()==null || gameInputDto.getStadium().isEmpty()
        || gameInputDto.getTeam1() == null || gameInputDto.getTeam1().isEmpty()
        || gameInputDto.getTeam2() == null || gameInputDto.getTeam2().isEmpty())
            throw new RuntimeException("Missing Fields");
        if (gameInputDto.getAvailableTickets() > 2022 || gameInputDto.getAvailableTickets() <= 0)
            throw new RuntimeException("Number of tickets should be between 1 and 2022");
        Game game = new Game();
        game.setId(UUID.randomUUID().toString());
        game.setDateAndTime(gameInputDto.getDateAndTime());
        game.setStadium(gameInputDto.getStadium());
        game.setTeam1(gameInputDto.getTeam1());
        game.setTeam2(gameInputDto.getTeam2());
        game.setRef(UUID.randomUUID().toString());
        game.setAvailableTicketNumber(gameInputDto.getAvailableTickets());
        return mapperService.fromGame(gameRepository.save(game));
    }
    @Override
    public List<GameOutputDto> gamesList(){
        return gameRepository.findAll().stream().map(
                g -> mapperService.fromGame(g)
        ).toList();
    }
}
