package com.dno2reload.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Reservations{
    @Id
    @GeneratedValue
    private Long id;

    private String reservationName;

}
