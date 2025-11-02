package com.ahc.Reserva_hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="rooms")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=10)
    private String number;

    @Column(length=10,nullable=false)
    private String type;

    private BigDecimal pricePerNight;



    //Relation OnetoMany
    @OneToMany(mappedBy = "room",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ReservationEntity> reservations;

}
