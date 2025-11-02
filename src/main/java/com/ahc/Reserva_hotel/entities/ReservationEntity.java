package com.ahc.Reserva_hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="reservation")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false)
    private String customer;

    private LocalDate checkinDate;
    private LocalDate checkoutDate;

    //Relation ManytoOne
    @ManyToOne
    @JoinColumn(name="id_room",nullable = false)
    private RoomEntity room;

}
