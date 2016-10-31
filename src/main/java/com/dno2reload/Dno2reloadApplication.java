package com.dno2reload;

import com.dno2reload.domain.Reservations;
import com.dno2reload.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Dno2reloadApplication implements CommandLineRunner{

	@Autowired
	private ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(Dno2reloadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Arrays.asList("Sasha,Petya,Alex".split(","))
				.forEach(n->reservationRepository.save(new Reservations(n)));
		reservationRepository.findAll().forEach(System.out::println);
		reservationRepository.findByReservationName("Alex");
	}
}



