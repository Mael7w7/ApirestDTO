package com.ahc.Reserva_hotel.service.implservice;

import com.ahc.Reserva_hotel.dto.RoomDTO;
import com.ahc.Reserva_hotel.entities.RoomEntity;
import com.ahc.Reserva_hotel.repositories.RoomRepository;
import com.ahc.Reserva_hotel.service.iservice.IRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService implements IRoomService {

    //inyeccion de dependecia
    private final RoomRepository roomRepository;

    @Override
    public RoomEntity addRoom(RoomEntity room) {
        return roomRepository.save(room);
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        return roomRepository.findAll()
                .stream()
                .map(r-> new RoomDTO(
                        r.getId(),
                        r.getNumber(),
                        r.getType(),
                        r.getPricePerNight()))
                .toList();
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
