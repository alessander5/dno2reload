package com.dno2reload;

import com.dno2reload.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Dno2reloadApplication{

	public static void main(String[] args) {
		SpringApplication.run(Dno2reloadApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ReservationRepository repository) {
		return (args) -> {
			repository.findAll().forEach(System.out::println);
			repository.findByReservationName("Alex").forEach(System.out::println);
		};
	}

}




