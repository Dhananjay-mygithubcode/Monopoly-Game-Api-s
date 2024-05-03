package com.monopoly;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonopolyGameApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonopolyGameApiApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public Random random(){ 
		return new Random();
	}
	

}
