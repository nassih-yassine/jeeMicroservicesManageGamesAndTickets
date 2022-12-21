package com.nassih.gamesmanager.web;

import com.nassih.gamesmanager.dtos.inputDtos.TicketInputDto;
import com.nassih.gamesmanager.dtos.outputDtos.TicketOutputDto;
import com.nassih.gamesmanager.services.Ticket.TicketServices;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketGraphqlController {
    private TicketServices ticketServices;

    @MutationMapping
    private TicketOutputDto getTicket(@Argument TicketInputDto ticketInputDto){
        return ticketServices.buyTicket(ticketInputDto);
    }

    @MutationMapping
    private void updateTicket(@Argument String id){
        ticketServices.validateTicket(id);
    }
}
