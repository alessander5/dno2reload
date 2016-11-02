package com.dno2reload.controller.rest;

import com.dno2reload.domain.mysql.Reservation;
import com.dno2reload.dto.ReservationDto;
import com.dno2reload.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping("/do")
    void doSmth() {
        reservationService.doSmth();
    }

    @RequestMapping("/")
    Iterable<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @RequestMapping("/id/{id}")
    Object getReservationsById(@PathVariable("id") long id) {
        return reservationService.getReservationsById(id).get();
    }

    @RequestMapping("/{name}")
    Object getReservationsByReservationName(@PathVariable("name") String reservationName) {
        return reservationService.getReservationsByName(reservationName);
    }

    @RequestMapping("/{name}/super")
    Iterable<ReservationDto> getSuperReservationsByReservationName(@PathVariable("name") String reservationName) {
        return reservationService.getReservationsDtoByReservationName(reservationName);
    }

    @RequestMapping("/{name}/count")
    Integer getCountByReservationName( @PathVariable("name") String reservationName) {
        return reservationService.getReservationsCountByReservationName(reservationName);
    }

}
