package com.nassih.gamesmanager.exceptions.custome;

public class TicketsSoldOutException extends Exception{
    public TicketsSoldOutException(){
        super("Tickets For this Game are Sold Out!!!");
    }
}
