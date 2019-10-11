package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Review;
import com.jobook.EntAppProject.model.User;

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
