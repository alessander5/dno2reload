package com.dno2reload.service;

import com.dno2reload.domain.mysql.Reservation;

import java.util.Optional;

public interface ReservationService{

    <T> T getAllReservations();

    Optional<Reservation> getReservationsById(long id);

    <T> T getReservationsByName(String name);

    <T> T getReservationsCountByReservationName(String name);

    <T> T getReservationsDtoByReservationName(String name);

    void doSmth();

}

