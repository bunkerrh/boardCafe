package com.bunkware.bc.boardCafe.Service;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import com.bunkware.bc.boardCafe.Repository.BoardGameRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameRentalService {

    @Autowired
    BoardGameRentalRepository boardGameRentalRepository;

   public void createBoardGameRental(BoardGameRental boardGameRental)
   {
       boardGameRentalRepository.createBoardGame(boardGameRental);
   }

   public List<BoardGameRental> getAllBoardGames()
   {
       return boardGameRentalRepository.getAllBoardGames();
   }


   public BoardGameRental getBoardGameById (BoardGameRental boardGameRental)
   {
       return boardGameRentalRepository.getBoardGameById(boardGameRental);
   }

   public BoardGameRental getBoardGameByName(BoardGameRental boardGameRental)
   {
       return boardGameRentalRepository.getBoardGameByName(boardGameRental);
   }

   public void editBoardGame(BoardGameRental boardGameRental)
   {
     boardGameRentalRepository.editBoardGame(boardGameRental);
   }
}
