package com.jobook.EntAppProject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobook.EntAppProject.Services.IJobService;
import com.jobook.EntAppProject.Services.IUserService;
import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobServiceUnitTests {
	@Autowired
	IJobService jobService;
	@Autowired
	IUserService userService;

	@Test
	public void lookupCustomerRelatedJobs()
	{
		User user = userService.login("test", "Password");
		List<Job> jobs = jobService.getUsersRelatedJobs(user.getId());
		assertTrue(jobs.size() > 0);
	}

	@Test
	public void lookupEmployeeRelatedJobs()
	{
		User user = userService.login("testemployee", "Password");
		List<Job> jobs = jobService.getUsersRelatedJobs(user.getId());
		assertTrue(jobs.size() > 0);
	}

	@Test
	public void badLookupRelatedJobs()
	{
		List<Job> jobs = jobService.getUsersRelatedJobs(5);
		assertEquals(0, jobs.size());
	}

	@Test
	public void searchForJobsMultiResult()
	{
		List<Job> jobs = jobService.searchJobByName("Test");
		assertTrue(jobs.size() > 1);
	}

	@Test
	public void searchForJobsNoResult()
	{
		List<Job> jobs = jobService.searchJobByName("sdaskf");
		assertEquals(0, jobs.size());
	}
}
