package com.masai.hotelServiceMicro.Service;

import com.masai.hotelServiceMicro.Exception.HotelException;
import com.masai.hotelServiceMicro.Model.Hotel;

import java.util.List;

public interface HotelService {
    public Hotel addHotel(Hotel hotel);
    public Hotel getHotel(String hotelId)throws HotelException;
    public List<Hotel> getAllHotels()throws  HotelException;
    public Hotel updateHotel(Hotel hotel)throws  HotelException;
    public String DeleteHotel(String hotelId)throws  HotelException;
}
