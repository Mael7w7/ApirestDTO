package com.ahc.Reserva_hotel.service.iservice;

import com.ahc.Reserva_hotel.dto.RoomDTO;
import com.ahc.Reserva_hotel.entities.RoomEntity;

import java.util.List;

public interface IRoomService {
    RoomEntity addRoom(RoomEntity room); //Registrar habitaciones
    List<RoomDTO> getAllRooms(); // Listar Habitaciones con sus reservas
    void  deleteRoom(Long id);//

}
