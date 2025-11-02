package com.ahc.Reserva_hotel.service.implservice;

import com.ahc.Reserva_hotel.dto.ReservationDTO;
import com.ahc.Reserva_hotel.entities.ReservationEntity;
import com.ahc.Reserva_hotel.repositories.ReservationRepository;
import com.ahc.Reserva_hotel.service.iservice.IReservationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
@AllArgsConstructor
public class ReservationService implements IReservationService {
    private final ReservationRepository reservations;

    @Override
    public ReservationEntity addReservation(ReservationEntity reservation) {
        return reservations.save(reservation);
    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        return reservations.findAll()
                .stream()
                .map(r->new ReservationDTO(
                        r.getId(),
                        r.getCustomer(),
                        r.getCheckinDate(),
                        r.getCheckoutDate(),
                        r.getRoom().getNumber())).toList();
    }

    @Override
    public void deleteReservation(Long id) {
        reservations.deleteById(id);
    }
}
