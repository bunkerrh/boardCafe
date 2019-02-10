package com.bunkware.bc.boardCafe.Service;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import com.bunkware.bc.boardCafe.Dto.Rental;
import com.bunkware.bc.boardCafe.Repository.BoardGameRentalRepository;
import com.bunkware.bc.boardCafe.Repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoardGameRentalService {


    @Autowired
    JdbcTemplate jdbcTemplate;
    private RentalRepository rentalRepository;
    private BoardGameRentalRepository boardGameRentalRepository;

    @Autowired
    public BoardGameRentalService(RentalRepository rentalRepository, BoardGameRentalRepository boardGameRentalRepository) {
        this.rentalRepository = rentalRepository;
        this.boardGameRentalRepository = boardGameRentalRepository;
    }


   public BoardGameRental createBoardGame(int minPlayers, int maxPlayers, int suggestedAge, double rentalPrice, String desc, String name, int rentalId, String rentalImagePath)
   {
       Optional<Rental> rental = rentalRepository.findById(rentalId);
       if(rental == null)
       {
           throw new RuntimeException("Rental does not exists " + name + ". Rental ID: " + rentalId);
       }

       return boardGameRentalRepository.save((new BoardGameRental(minPlayers, maxPlayers, suggestedAge, rentalPrice, desc, name, rentalId, rentalImagePath)));
   }



    public Iterable<BoardGameRental> lookup()
    {
        return boardGameRentalRepository.findAll();
    }

}
