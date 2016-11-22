package com.dno2reload.domain.mongo;

import com.dno2reload.domain.mysql.Reservation;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.math.BigInteger;
import java.util.Set;

@Data
@Document
public class Booking {

    private BigInteger id;

    private String surname;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
