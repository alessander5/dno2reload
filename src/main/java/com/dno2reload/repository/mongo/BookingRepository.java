package com.dno2reload.repository.mongo;

import com.dno2reload.domain.mongo.Booking;
import org.springframework.data.repository.CrudRepository;
import java.math.BigInteger;

public interface BookingRepository extends CrudRepository<Booking, BigInteger>{

    Iterable<Booking> findBySurname(String bs);

}
