package com.nassih.gamesmanager.repositories;

import com.nassih.gamesmanager.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
