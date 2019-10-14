package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Review;
import com.jobook.EntAppProject.model.User;

public interface IReviewService {
	/**
	 * gets all reviews related to the user by searching the reviews based on the userId provided
	 * @param userId the user id to get the reviews for
	 * @return a list of reviews that belong to a user
	 * @throws Exception any problem in the underlying query
	 */
	List<Review> getUserRelatedReviews(int userId) throws Exception;

	/**
	 * gets the review based on the provided job Id
	 * @param jobId id of job to get review for
	 * @return the review, if found
	 * @throws Exception any problem in the underlying querying
	 */
	Review getJobReview(int jobId) throws Exception;
}
