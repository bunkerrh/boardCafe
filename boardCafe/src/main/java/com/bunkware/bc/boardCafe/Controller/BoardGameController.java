package com.bunkware.bc.boardCafe.Controller;

import com.bunkware.bc.boardCafe.Dto.BoardGameRental;
import com.bunkware.bc.boardCafe.Service.BoardGameRentalService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("boardGameRental")
public class BoardGameController {

    @Autowired
    BoardGameRentalService boardGameRentalService;

    @RequestMapping(value = "createNewBoardGame", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNewBoardGame(@RequestBody  BoardGameRental boardGameRental)
    {
        try
        {
            boardGameRentalService.createBoardGameRental(boardGameRental);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception ex)
        {
            return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "getAllBoardGames" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<BoardGameRental> getAllBoardGames()
    {
        {
            try
            {
               return boardGameRentalService.getAllBoardGames();
            }
            catch (Exception ex)
            {
                List<BoardGameRental> boardGameRentals = new ArrayList<>();
                return boardGameRentals;
            }
        }
    }

    @RequestMapping(value = "getBoardGameById" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public BoardGameRental getBoardGameById(BoardGameRental boardGameRental)
    {
        {
            try
            {
                return boardGameRentalService.getBoardGameById(boardGameRental);
            }
            catch (Exception ex)
            {
               BoardGameRental boardGameRentals = new BoardGameRental();
                return boardGameRentals;
            }
        }
    }

    @RequestMapping(value = "getBoardGameByName" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public BoardGameRental getBoardGameByName(BoardGameRental boardGameRental)
    {
        {
            try
            {
                return boardGameRentalService.getBoardGameByName(boardGameRental);
            }
            catch (Exception ex)
            {
                BoardGameRental boardGameRentals = new BoardGameRental();
                return boardGameRentals;
            }
        }
    }

    @RequestMapping(value = "editBoardGame" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllBoardGames(BoardGameRental boardGameRental)
    {
        {
            try
            {
                boardGameRentalService.editBoardGame(boardGameRental);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            catch (Exception ex)
            {
                return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

            }
        }
    }

}
