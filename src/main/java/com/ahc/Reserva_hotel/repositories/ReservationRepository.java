package com.ahc.Reserva_hotel.repositories;

import com.ahc.Reserva_hotel.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

}
