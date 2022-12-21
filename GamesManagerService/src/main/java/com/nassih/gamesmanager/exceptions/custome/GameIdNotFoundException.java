package com.nassih.gamesmanager.exceptions.custome;

public class GameIdNotFoundException extends Exception{
    public GameIdNotFoundException(String id){
        super("The given game id: "+id+", is not found!!");
    }
}
