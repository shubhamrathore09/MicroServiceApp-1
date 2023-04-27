package com.masai.userServiceInMicro.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private String feedBack;
    private Integer rating;
}
