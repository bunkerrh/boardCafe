package com.bunkware.bc.boardCafe.Repository;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardGameRentalRepository
{
    void createBoardGame(BoardGameRental boardGameRental);

    List<BoardGameRental> getAllBoardGames();

    BoardGameRental getBoardGameById(BoardGameRental boardGameRental);

    BoardGameRental getBoardGameByName(BoardGameRental boardGameRental);

    void editBoardGame(BoardGameRental boardGameRental);
}
