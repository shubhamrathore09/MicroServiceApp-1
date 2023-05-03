package com.masai.ratingServiceMirco.RatingController;

import com.masai.ratingServiceMirco.Exception.RatingException;
import com.masai.ratingServiceMirco.Model.Rating;
import com.masai.ratingServiceMirco.RatingService.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/rating")
    public ResponseEntity<Rating> addRatingHandler(@RequestBody Rating rating){
        return new ResponseEntity<>(ratingService.addRating(rating), HttpStatus.CREATED);
    }

    @GetMapping("/rating/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUser(@PathVariable("userId") String userId) throws RatingException {
        return new ResponseEntity<>(ratingService.getAllRatingByUserId(userId),HttpStatus.OK);
    }

    @GetMapping("/rating/hotel/{hotelId}")
    public ResponseEntity<List<Rating>>getRatingByHotel(@PathVariable("hotelId") String hotelId) throws RatingException {
        return new ResponseEntity<>(ratingService.getAllRatingByHotelId(hotelId),HttpStatus.OK);
    }

}
