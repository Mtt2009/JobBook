package com.jobook.EntAppProject.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.Review;
import org.springframework.util.Assert;

@Component
public class ReviewServiceStub implements IReviewService {

	private final IUserService userService;
	private final IJobService jobService;
	private List<Review> reviews;

	@Autowired
	public ReviewServiceStub(IUserService userService, IJobService jobService) {
		this.userService = userService;
		this.jobService = jobService;
	}

	private void generateTestReviews() throws Exception {
		Assert.notNull(userService, "User service is null -- check DI container");
		Assert.notNull(jobService, "Job service is null -- check DI container");
		reviews = new ArrayList<>();
		Customer customer = (Customer) userService.getUserInfoById(0);
		Employee employee = (Employee) userService.getUserInfoById(1);
		Job job = jobService.searchJobByName("2").get(0);
		reviews.add(new Review(employee.getId(), customer.getId(), job.getJobId(), "This was a good job,", "Test Job 2 Reivew", 5.0));

	}

	public List<Review> getUserRelatedReviews(int userId) throws Exception {
		generateTestReviews();
		List<Review> filteredReviews = new ArrayList<Review>();

		for (Review review : reviews)
		{
			if ((review.getCustomerId() != null && review.getCustomerId() == userId) || (review.getEmployeeId() != null && review.getEmployeeId() == userId))
				filteredReviews.add(review);
		}

		return filteredReviews;
	}

	public Review getJobReview(int jobId) throws Exception {
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
