package com.jobook.EntAppProject.DAO.Interfaces;

import java.util.List;

import com.jobook.EntAppProject.model.Review;
import com.jobook.EntAppProject.model.User;

public interface IReviewProvider {
	public List<Review> GetUserRelatedReviews(User user);
}
