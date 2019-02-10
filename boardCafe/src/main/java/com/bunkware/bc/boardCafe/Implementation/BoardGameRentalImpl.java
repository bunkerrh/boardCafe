package com.bunkware.bc.boardCafe.Implementation;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import com.bunkware.bc.boardCafe.Implementation.Query.BoardGameQuery;
import com.bunkware.bc.boardCafe.Mapper.BoardGameMapper;
import com.bunkware.bc.boardCafe.Repository.BoardGameRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BoardGameRentalImpl  implements BoardGameRentalRepository
{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    BoardGameMapper boardGameMapper;

    @Override
    public void createBoardGame(BoardGameRental boardGameRental) {

        jdbcTemplate.update(BoardGameQuery.CREATE_BOARD_GAME);
    }

    @Override
    public List<BoardGameRental> getAllBoardGames() {
        return jdbcTemplate.query(BoardGameQuery.GET_ALL_BOARD_GAMES, boardGameMapper);
    }

    @Override
    public BoardGameRental getBoardGameById(BoardGameRental boardGameRental) {
       return (BoardGameRental) jdbcTemplate.query(BoardGameQuery.GET_BOARD_GAMES_BY_ID,
               boardGameMapper, boardGameRental.getRentalId());
    }

    @Override
    public BoardGameRental getBoardGameByName(BoardGameRental boardGameRental) {
        return (BoardGameRental) jdbcTemplate.query(BoardGameQuery.GET_BOARD_GAMES_BY_NAME,
                boardGameMapper, boardGameRental.getRentalId());
    }

    @Override
    public void  editBoardGame(BoardGameRental boardGameRental) {
        jdbcTemplate.update(BoardGameQuery.UPDATE_BOARD_GAME,
                boardGameRental.getRentalId());
    }
}
