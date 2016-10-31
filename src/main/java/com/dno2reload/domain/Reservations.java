package com.dno2reload.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Reservations{
    @Id
    @GeneratedValue
    private Long id;

    private String reservationName;

    public Reservations(){
    }

    public Reservations(String reservationName){
        this.reservationName = reservationName;
    }

}
