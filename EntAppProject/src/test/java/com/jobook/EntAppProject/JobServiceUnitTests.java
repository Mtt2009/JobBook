package com.jobook.EntAppProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobServiceUnitTests {
	@Autowired
	IJobService jobService;
	@Autowired
	IUserService userService;
	
	User user;
	List<Job> jobs;
	
	@Before
	public void BeforeEachTest()
	{
		user = null;
		jobs = null;
	}
	
	@Test
	public void lookupCustomerRelatedJobs()
	{
		customerLogin();
		customerViewsTheirJobs();
		assertTrue(jobs.size() > 0);
	}

	private void customerLogin() {
		user = userService.login("test", "Password");
	}

	private void customerViewsTheirJobs() {
		jobs = jobService.getUsersRelatedJobs(user.getId());
	}
	
	@Test
	public void lookupEmployeeRelatedJobs()
	{
		employeeLogin();
		employeeViewsTheirJobs();
		assertTrue(jobs.size() > 0);
	}

	private void employeeLogin() {
		user = userService.login("testemployee", "Password");
	}

	private void employeeViewsTheirJobs() {
		jobs = jobService.getUsersRelatedJobs(user.getId());
	}
	
	@Test
	public void badLookupRelatedJobs()
	{
		jobs = jobService.getUsersRelatedJobs(5);
		assertTrue(jobs.size() == 0);
	}
	
	@Test
	public void searchForJobsMultiResult()
	{
		jobs = jobService.searchJobByName("Test");
		assertTrue(jobs.size() > 1);
	}
	
	@Test
	public void searchForJobsNoResult()
	{
		jobs = jobService.searchJobByName("sdaskf");
		assertTrue(jobs.size() == 0);
	}
}
