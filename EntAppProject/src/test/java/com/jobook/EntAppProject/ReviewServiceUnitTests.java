package com.jobook.EntAppProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.jobook.EntAppProject.Services.IJobService;
import com.jobook.EntAppProject.Services.IReviewService;
import com.jobook.EntAppProject.Services.IUserService;
import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.Review;
import com.jobook.EntAppProject.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewServiceUnitTests {
	@Autowired
	IJobService jobService;
	@Autowired
	IUserService userService;
	@Autowired
	IReviewService reviewService;

	@Test
	public void getReviewsRelatedToCustomer()
	{
		User user = userService.getUserInfoById(0);
		List<Review> reviews = reviewService.getUserRelatedReviews(user.getId());
		assertTrue(reviews.size() >= 1);
	}

	@Test
	public void getReviewsRelatedToEmployee()
	{
		User user = userService.getUserInfoById(1);
		List<Review> reviews = reviewService.getUserRelatedReviews(user.getId());
		assertTrue(reviews.size() >= 1);
	}

	@Test
	public void getReviewOfJob()
	{
		User user = userService.getUserInfoById(0);
		Job job = jobService.getUsersRelatedJobs(user.getId()).get(1);
		Review review = reviewService.getJobReview(job.getJobId());
		assertNotNull(review);
	}
}
