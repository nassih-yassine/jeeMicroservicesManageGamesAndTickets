package com.nassih.gamesmanager.services.Ticket;

import com.nassih.gamesmanager.dtos.inputDtos.TicketInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.TicketOutputDto;
import com.nassih.gamesmanager.exceptions.custome.*;

public interface TicketServices {
    TicketOutputDto buyTicket(TicketInputDto ticketInputDto) throws MissingFieldsException, GameIdNotFoundException, TicketsSoldOutException;

    void validateTicket(String id) throws TicketIdNotFoundException, TicketAlreadyValidatedException;
}
