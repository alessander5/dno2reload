package com.dno2reload.repository.mysql;

import com.dno2reload.domain.mysql.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    Collection<Reservation> findByReservationName(String rn);

    Optional<Reservation> findById(long id);

}