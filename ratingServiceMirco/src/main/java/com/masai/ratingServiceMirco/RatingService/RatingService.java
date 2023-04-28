package com.masai.ratingServiceMirco.RatingService;

import com.masai.ratingServiceMirco.Exception.RatingException;
import com.masai.ratingServiceMirco.Model.Rating;

public interface RatingService {
    public Rating addRating();
    public String deleteRating(String ratingId)throws RatingException;
}
