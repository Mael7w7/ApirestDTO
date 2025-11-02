package com.ahc.Reserva_hotel.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class RoomDTO {

    private Long id;
    private String number;
    private String type;
    private BigDecimal price;

}
