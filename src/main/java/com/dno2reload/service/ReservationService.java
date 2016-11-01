package com.dno2reload.service;

public interface ReservationService{

    <T> T getAllReservations();

    <T> T getReservationsByName(String name);

    <T> T getReservationsCountByName(String name);

    <T> T getReservationsDtoByName(String name);


}

