package com.nassih.gamesmanager.exceptions.custome;

public class TicketIdNotFoundException extends Exception{
    public TicketIdNotFoundException(String id){
        super("The given ticket id: "+id+", is not found!!");
    }
}
