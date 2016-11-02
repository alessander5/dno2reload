package com.dno2reload.service.rest;

import com.dno2reload.repository.mongo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingRestService {
    @Autowired
    private BookingRepository bookingRepository;

}
