package com.jobook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jobook.model.Customer;
import com.jobook.model.Employee;
import com.jobook.model.Job;
import com.jobook.model.Review;

@Component
public class ReviewServiceStub implements IReviewService {

	@Autowired
	IUserService userService;
	@Autowired
	IJobService jobService;
	List<Review> reviews;
	
	private void generateTestReviews()
	{
		reviews = new ArrayList<Review>();
		Customer customer = (Customer) userService.getUserInfoById(0);
		Employee employee = (Employee) userService.getUserInfoById(1);
		Job job = jobService.searchJobByName("2").get(0);
		reviews.add(new Review(employee.getId(), customer.getId(), job.getJobId(), "This was a good job,", "Test Job 2 Reivew", 5.0));
		
	}

	public List<Review> getUserRelatedReviews(int userId) {
		generateTestReviews();
		List<Review> filteredReviews = new ArrayList<Review>();
		
		for (Review review : reviews)
		{
			if ((review.getCustomerId() != null && review.getCustomerId() == userId) || (review.getEmployeeId() != null && review.getEmployeeId() == userId))
				filteredReviews.add(review);
		}
		
		return filteredReviews;
	}

	public Review getJobReview(int jobId) {
		generateTestReviews();
		Review jobReview = null;
		
		for (Review review : reviews)
		{
			if (review.getJobId() != null && review.getJobId() == jobId)
				jobReview = review;
		}
		
		return jobReview;
	}

}
