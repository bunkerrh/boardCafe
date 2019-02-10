package com.bunkware.bc.boardCafe.Mapper;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import org.springframework.stereotype.Component;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class BoardGameMapper implements RowMapper<BoardGameRental> {
    @Override
    public BoardGameRental mapRow(ResultSet resultSet, int i) throws SQLException {
        BoardGameRental boardGameRental = new BoardGameRental();

        boardGameRental.setRentalId(resultSet.getInt("BOARD_GAME_ID"));
        boardGameRental.setName(resultSet.getString("BOARD_GAME_NAME"));
        boardGameRental.setDesc(resultSet.getString("BOARD_GAME_DESC"));
        boardGameRental.setMinPlayers(resultSet.getInt("MIN_SUGGESTED_PLAYERS"));
        boardGameRental.setMaxPlayers(resultSet.getInt("MAX_SUGGESTED_PLAYERS"));
        boardGameRental.setSuggestedAge(resultSet.getInt("SUGGESTED_AGE"));
        boardGameRental.setRentalPrice(resultSet.getDouble("PRICE"));
        boardGameRental.setRentalImagePath(resultSet.getString("RENTAL_IMAGE_PATH"));
        return boardGameRental;
    }
}
