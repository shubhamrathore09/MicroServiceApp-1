package com.masai.ratingServiceMirco.RatingService;

import com.masai.ratingServiceMirco.Exception.RatingException;
import com.masai.ratingServiceMirco.Model.Rating;
import com.masai.ratingServiceMirco.RatingRepo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements  RatingService{
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating addRating(Rating rating) {
        String ratingId= UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRatingByUserId(String userrId) throws RatingException {
        return ratingRepo.findByUserId(userrId);
    }

    @Override
    public List<Rating> getAllRatingByHotelId(String hotelId) throws RatingException {
        return ratingRepo.findByHotelId(hotelId);
    }
}
