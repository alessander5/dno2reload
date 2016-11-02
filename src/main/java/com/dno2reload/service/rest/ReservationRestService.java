package com.dno2reload.service.rest;

import com.dno2reload.domain.mysql.Reservation;
import com.dno2reload.dto.ReservationDto;
import com.dno2reload.repository.mysql.ReservationRepository;
import com.dno2reload.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservationRestService implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Iterable<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> getReservationsById(long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Collection<Reservation> getReservationsByName(String name) {
        return reservationRepository.findByReservationName(name);
    }

    @Override
    public Integer getReservationsCountByReservationName(String name) {
        return reservationRepository.findByReservationName(name).size();
    }

    @Override
    public Collection<ReservationDto> getReservationsDtoByReservationName(String name) {
        return getReservationsByName(name).stream()
                .map(ReservationDto::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void doSmth() {
        /*Booking booking = new Booking();
        booking.setSurname("shtaniuk");
        Reservation hotel= new Reservation(),car = new Reservation();
        hotel.setReservationName("best hotel");
        car.setReservationName("best car");
        bookingRepository.save(booking);*/
    }
}
