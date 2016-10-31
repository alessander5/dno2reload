package com.dno2reload.repository;

import com.dno2reload.domain.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations, Long> {

    Collection<Reservations> findByReservationName(String rn);

}