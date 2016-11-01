package com.dno2reload.service.rest;

import com.dno2reload.domain.Reservation;
import com.dno2reload.dto.ReservationDto;
import com.dno2reload.repository.mysql.ReservationRepository;
import com.dno2reload.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationRestService implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Collection<Reservation> getReservationsByName(String name) {
        return reservationRepository.findByReservationName(name);
    }

    @Override
    public Integer getReservationsCountByName(String name) {
        return reservationRepository.findByReservationName(name).size();
    }

    @Override
    public Collection<ReservationDto> getReservationsDtoByName(String name) {
        return getReservationsByName(name).stream()
                .map(ReservationDto::convertToDto)
                .collect(Collectors.toList());

    }

}
