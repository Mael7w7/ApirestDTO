package com.ahc.Reserva_hotel.controllers;

import com.ahc.Reserva_hotel.dto.RoomDTO;
import com.ahc.Reserva_hotel.entities.RoomEntity;
import com.ahc.Reserva_hotel.service.implservice.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
@AllArgsConstructor

public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public List<RoomDTO> getRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping
    public RoomEntity addRoom(@RequestBody RoomEntity room) {
        return roomService.addRoom(room);

    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }


}
