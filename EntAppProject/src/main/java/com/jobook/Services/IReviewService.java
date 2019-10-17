package com.jobook.Services;

import java.util.List;

import com.jobook.model.Review;
import com.jobook.model.User;

public interface IReviewService {
	/**
	 * gets all reviews related to the user by searching the reviews based on the userId provided
	 * @param userId
	 * @return
	 */
	List<Review> getUserRelatedReviews(int userId);

	/**
	 * gets the review based on the provided job Id
	 * @param jobId
	 * @return
	 */
	Review getJobReview(int jobId);
}
