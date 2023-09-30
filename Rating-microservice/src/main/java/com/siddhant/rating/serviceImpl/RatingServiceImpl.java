package com.siddhant.rating.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.siddhant.rating.entity.Rating;
import com.siddhant.rating.exception.RatingException;
import com.siddhant.rating.repository.RatingRepository;
import com.siddhant.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<Rating> getuserrating(String userId) {
		
		List<Rating> userratingList = ratingRepository.findByUserId(userId);
		return userratingList;
		//if(!CollectionUtils.isEmpty(userratingList)){
			
		//}
//		else
//		{
//			throw new RatingException("rating not found for given user Id");
//		}
		
	}

	@Override
	public List<Rating> gethotelrating(String hotelid) {
		List<Rating> hotelratinglist = ratingRepository.findByHotelId(hotelid);
		return hotelratinglist;
//		if(!CollectionUtils.isEmpty(hotelratinglist)) {
//			
//		}
//		else
//		{
//			throw new RatingException("rating not found for given Hotel Id");
//		}
	}

	@Override
	public Rating saverating(Rating rating) {
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}



}
