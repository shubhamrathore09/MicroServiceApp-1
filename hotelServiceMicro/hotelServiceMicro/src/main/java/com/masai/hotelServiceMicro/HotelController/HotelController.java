package com.masai.hotelServiceMicro.HotelController;

import com.masai.hotelServiceMicro.Exception.HotelException;
import com.masai.hotelServiceMicro.Model.Hotel;
import com.masai.hotelServiceMicro.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotel")
    public ResponseEntity<Hotel> addHotelHandler(@RequestBody Hotel hotel) {
        return new ResponseEntity<>(hotelService.addHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<Hotel> GetHotelByIdHandler(@PathVariable("hotelId")String hotelId) throws HotelException {
        return new ResponseEntity<>(hotelService.getHotel(hotelId), HttpStatus.OK);
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotels() throws HotelException {
        return new ResponseEntity<>(hotelService.getAllHotels(), HttpStatus.OK);
    }

    @DeleteMapping("/hotel/{hotelId}")
    public ResponseEntity<String> deleteHotelById(@PathVariable("hotelId") String hotelId) throws HotelException {
        return new ResponseEntity<String>(hotelService.DeleteHotel(hotelId), HttpStatus.OK);
    }
    @PutMapping("/hotel")
    public ResponseEntity<Hotel> updateHotelHandler(@RequestBody Hotel hotel) throws HotelException {
        return new ResponseEntity<>(hotelService.updateHotel(hotel),HttpStatus.OK);
    }
}
