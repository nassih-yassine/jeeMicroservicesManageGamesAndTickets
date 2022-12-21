package com.nassih.gamesmanager.services.Ticket;

import com.nassih.gamesmanager.dtos.inputDtos.TicketInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.TicketOutputDto;

public interface TicketServices {
    TicketOutputDto buyTicket(TicketInputDto ticketInputDto);

    void validateTicket(String id);
}
