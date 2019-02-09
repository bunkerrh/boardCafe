package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Entity;

@Entity
public class BoardGameRental extends Rental
{
    private int minPlayers;
    private int maxPlayers;
    private int suggestedAge;


    public BoardGameRental() {
    }

    public BoardGameRental(int minPlayers, int maxPlayers, int suggestedAge) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.suggestedAge = suggestedAge;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getSuggestedAge() {
        return suggestedAge;
    }

    public void setSuggestedAge(int suggestedAge) {
        this.suggestedAge = suggestedAge;
    }
}
