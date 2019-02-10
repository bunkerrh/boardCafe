package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;


//These would likely be domains
@Entity
public class BoardGameRental extends Rental
{
    @Column
    private int minPlayers;
    @Column
    private int maxPlayers;
    @Column
    private int suggestedAge;


    public BoardGameRental() {
    }

    public BoardGameRental(int minPlayers, int maxPlayers, int suggestedAge, Double rentalPrice, String desc, String name, int rentalId, String rentalImagePath) {
        super.setName(name);
        super.setDesc(desc);
        super.setRentalPrice(rentalPrice);
        super.setRentalId(rentalId);
        super.setRentalImagePath(rentalImagePath);
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
