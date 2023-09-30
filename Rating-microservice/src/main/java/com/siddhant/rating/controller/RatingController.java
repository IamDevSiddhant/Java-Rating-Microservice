package com.siddhant.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddhant.rating.entity.Rating;
import com.siddhant.rating.service.RatingService;



@RestController
@RequestMapping("/rating")
public class RatingController {

	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/saverating")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		Rating rating1 = ratingService.saverating(rating);
		return new ResponseEntity<Rating>(rating1,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getallrating")
	public ResponseEntity<List<Rating>> getAll(){
		List<Rating> rating1= ratingService.getAllRating();
		return new ResponseEntity<List<Rating>>(rating1,HttpStatus.OK);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseEntity<List<Rating>> getbyUserId(@PathVariable String userId){
		List<Rating> rating1 = ratingService.getuserrating(userId);
		return new ResponseEntity<List<Rating>>(rating1,HttpStatus.OK);
	}
	
	@GetMapping("/getByHotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getbyHotelId(@PathVariable String hotelId){
		List<Rating> rating1 = ratingService.gethotelrating(hotelId);
		return new ResponseEntity<List<Rating>>(rating1,HttpStatus.OK);
	}
	
	
}
