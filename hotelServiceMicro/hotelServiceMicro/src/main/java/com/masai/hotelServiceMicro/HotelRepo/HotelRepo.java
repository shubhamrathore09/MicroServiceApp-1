package com.masai.hotelServiceMicro.HotelRepo;

import com.masai.hotelServiceMicro.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,String> {
}
