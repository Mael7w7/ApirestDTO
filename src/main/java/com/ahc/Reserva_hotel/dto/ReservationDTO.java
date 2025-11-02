package com.ahc.Reserva_hotel.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ReservationDTO {
    private Long id;
    private String customer;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private String number;

}
