package com.dno2reload.controller.rest;

import com.dno2reload.domain.Reservation;
import com.dno2reload.dto.ReservationDto;
import com.dno2reload.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping("/")
    Collection<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @RequestMapping("/{name}")
    Collection<Reservation> getReservationsByName(@PathVariable("name") String reservationName) {
        return reservationService.getReservationsByName(reservationName);
    }

    @RequestMapping("/{name}/super")
    Collection<ReservationDto> getSuperReservationsByName(@PathVariable("name") String reservationName) {
        return reservationService.getReservationsDtoByName(reservationName);
    }

    @RequestMapping("/{name}/count")
    Integer getCountByName( @PathVariable("name") String reservationName) {
        return reservationService.getReservationsCountByName(reservationName);
    }

}
