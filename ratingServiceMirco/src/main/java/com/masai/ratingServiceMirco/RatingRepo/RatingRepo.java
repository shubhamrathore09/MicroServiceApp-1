package com.masai.ratingServiceMirco.RatingRepo;

import com.masai.ratingServiceMirco.Model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,String> {

    public List<Rating> findByUserId(String userId);
    public List<Rating> findByHotelId(String hotelId);
}
