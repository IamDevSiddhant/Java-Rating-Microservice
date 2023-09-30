package com.siddhant.rating.service;

import java.util.List;

import com.siddhant.rating.entity.Rating;

public interface RatingService {

	Rating saverating(Rating rating);
	
	List<Rating> getAllRating();
	
	List<Rating> getuserrating(String userId);
	
	List<Rating> gethotelrating(String hotelid);
	
}
