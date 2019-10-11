package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Review;
import com.jobook.EntAppProject.model.User;

public interface IReviewService {
	List<Review> getUserRelatedReviews(User user);
}
