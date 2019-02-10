package com.bunkware.bc.boardCafe;

import com.bunkware.bc.boardCafe.Dto.Rental;
import com.bunkware.bc.boardCafe.Service.RentalService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class BoardCafeApplication {

	@Autowired
	private RentalService rentalService;


	public static void main(String[] args) {
		SpringApplication.run(BoardCafeApplication.class, args);
	}

}

