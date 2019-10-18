package com.jobook.EntAppProject.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
import com.jobook.EntAppProject.model.Job;

@Component
public class JobServiceStub implements IJobService {
	
	@Autowired
	IUserService userService;
	
	private List<Job> jobs; 
	
	private void generateTestJobs()
	{
		jobs = new ArrayList<Job>();
		Customer customer = (Customer) userService.getUserInfoById(0);
		Employee employee = (Employee) userService.getUserInfoById(1);
		jobs.add(new Job(0, customer.getId(), null, customer, null, "This is Test Job 1.", "Test Job 1", null, null, 100.0));
		jobs.add(new Job(1, customer.getId(), employee.getId(), customer, employee, "This is Test Job 2.", "Test Job 2", null, null, 300.0));
		jobs.add(new Job(2, null, employee.getId(), null, employee, "This is Test Job 3.", "Test Job 3", null, null, 500.0));
		
	}
	
	public List<Job> getUsersRelatedJobs(int userId) {
		generateTestJobs();
		List<Job> filteredJobs = new ArrayList<Job>();
		
		for (Job job : jobs)
		{
			if ((job.getCustomerId() == userId) || (job.getEmployeeId() == userId)) {
				filteredJobs.add(job);
			}
		}
		
		return filteredJobs;
	}

	public List<Job> searchJobByName(String searchTerm) {
		generateTestJobs();
		List<Job> filteredJobs = new ArrayList<Job>();
		
		for (Job job : jobs)
		{
			if (job.getShortDesc().contains(searchTerm)) {
				filteredJobs.add(job);
			}
		}
		
		return filteredJobs;
	}

}
