package com.jobook.EntAppProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobook.EntAppProject.Services.IJobService;
import com.jobook.EntAppProject.Services.IReviewService;
import com.jobook.EntAppProject.Services.IUserService;
import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
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
	
	User user;
	List<Review> reviews;
	Review review;
	
	@Before
	public void BeforeEachTest()
	{
		user = null;
		reviews = new ArrayList<Review>();
		review = null;
	}
	
	@Test
	public void getReviewsRelatedToCustomer()
	{
		user = userService.getUserInfoById(0);
		userClicksOnAllReviews();
		assertTrue(reviews.size() >= 1);
	}

	private void userClicksOnAllReviews() {
		reviews = reviewService.getUserRelatedReviews(user.getId());
	}
	
	@Test
	public void getReviewsRelatedToEmployee()
	{
		user = userService.getUserInfoById(1);
		userClicksOnAllReviews();
		assertTrue(reviews.size() >= 1);
	}
	
	@Test
	public void getReviewOfJob()
	{
		user = userService.getUserInfoById(0);
		Job job = userClicksOnAJob();
		userClicksOnReview(job);
		assertNotNull(review);
	}

	private void userClicksOnReview(Job job) {
		review = reviewService.getJobReview(job.getJobId());
	}

	private Job userClicksOnAJob() {
		Job job = jobService.getUsersRelatedJobs(user.getId()).get(1);
		return job;
	}
	
}
