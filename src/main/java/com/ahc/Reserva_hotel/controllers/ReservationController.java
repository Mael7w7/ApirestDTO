package com.ahc.Reserva_hotel.controllers;


import com.ahc.Reserva_hotel.dto.ReservationDTO;
import com.ahc.Reserva_hotel.entities.ReservationEntity;
import com.ahc.Reserva_hotel.service.implservice.ReservationService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    private final ReservationService reservations;

    @GetMapping
    public List<ReservationDTO> getAllReservations() {
        return reservations.getAllReservations();
    }

    @PostMapping
    public ReservationEntity addReservation( @RequestBody ReservationEntity reservation) {
        return reservations.addReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        reservations.deleteReservation(id);
    }



}
