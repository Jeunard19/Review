package com.review.product.service;

import java.util.List;

import com.review.product.model.Review;


public interface IReviewService {
	
	public Review create(Review review);

	public List<Review> findByProductId(Long productId);

}
