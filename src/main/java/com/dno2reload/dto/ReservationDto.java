package com.dno2reload.dto;

import com.dno2reload.domain.mysql.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

@Builder
@Data
public class ReservationDto {

    // ToDo: WTF with index ???

    @JsonProperty(value = "specialId", index = 1)
    private long superId;
    @JsonProperty(index = 2)
    private String incredibleName;
    @JsonProperty (required = true)
    private String hipe;
    @JsonIgnore
    private String unknown;
    @JsonProperty(access = READ_ONLY)
    private String read_only;

    private static int count = 0;

    public static ReservationDto convertToDto(Reservation entity){
        return ReservationDto.builder()
                .superId(entity.getId())
                .incredibleName(entity.getReservationName())
                .hipe("SUPERRR " + ++count)
                .build();
    }
}
