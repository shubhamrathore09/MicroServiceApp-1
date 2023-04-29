package com.masai.ratingServiceMirco.RatingService;

import com.masai.ratingServiceMirco.Exception.RatingException;
import com.masai.ratingServiceMirco.Model.Rating;

import java.util.List;

public interface RatingService {
    public Rating addRating(Rating rating);
    public List<Rating> getAllRatingByUserId(String userrId)throws  RatingException;
    public List<Rating> getAllRatingByHotelId(String hotelId)throws RatingException;
}
