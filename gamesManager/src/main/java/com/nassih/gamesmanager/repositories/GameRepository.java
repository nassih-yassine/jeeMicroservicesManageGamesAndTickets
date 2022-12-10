package com.nassih.gamesmanager.repositories;

import com.nassih.gamesmanager.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
}
