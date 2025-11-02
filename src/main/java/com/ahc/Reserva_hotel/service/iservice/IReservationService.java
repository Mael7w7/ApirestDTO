package com.ahc.Reserva_hotel.service.iservice;

import com.ahc.Reserva_hotel.dto.ReservationDTO;
import com.ahc.Reserva_hotel.entities.ReservationEntity;

import java.util.List;

public interface IReservationService {
    ReservationEntity addReservation(ReservationEntity reservation);
    List<ReservationDTO> getAllReservations();
    void deleteReservation(Long id);
}
