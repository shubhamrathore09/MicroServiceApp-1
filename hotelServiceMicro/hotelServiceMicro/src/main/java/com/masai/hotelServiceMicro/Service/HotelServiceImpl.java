package com.masai.hotelServiceMicro.Service;

import com.masai.hotelServiceMicro.Exception.HotelException;
import com.masai.hotelServiceMicro.HotelRepo.HotelRepo;
import com.masai.hotelServiceMicro.Model.Hotel;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel addHotel(Hotel hotel) {
        String hotelId= UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel getHotel(String hotelId) throws HotelException {
        return hotelRepo.findById(hotelId).orElseThrow(()->new HotelException("No hotel available by that id"));
//        return hotelRepo.save(hotel);
    }


    @Override
    public List<Hotel> getAllHotels() throws HotelException {
        List<Hotel> hotels=hotelRepo.findAll();
        if(hotels==null){
            throw  new HotelException("no hotels are available");
        }
        return hotels;
    }

    @Override
    public Hotel updateHotel(Hotel hotel) throws HotelException {
//        Hotel hotel1=hotelRepo.findById(hotel.getHotelId()).orElseThrow(()->new HotelException("No Hotel found by that id"));
        return hotelRepo.save(hotel);
    }

    @Override
    public String DeleteHotel(String hotelId) throws HotelException {
        Hotel hotel1=hotelRepo.findById(hotelId).orElseThrow(()->new HotelException("No Hotel found by that id"));
         hotelRepo.delete(hotel1);
         return "Deleted succeffully";
    }
}
