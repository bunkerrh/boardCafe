package com.bunkware.bc.boardCafe;

import com.bunkware.bc.boardCafe.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardCafeApplication {

	@Autowired
	private RentalService rentalService;


	public static void main(String[] args) {
		SpringApplication.run(BoardCafeApplication.class, args);
	}

}

