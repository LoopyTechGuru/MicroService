package com.loopytechguru.resources;

import com.loopytechguru.models.Rating;
import com.loopytechguru.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @GetMapping("/users/{userId}")
    public UserRating getRatingByUserId(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("100", 4),
                new Rating("102", 4)
        );
        UserRating userRating= new UserRating();
        userRating.setUserRating(ratings);
        return userRating;

    }
}
