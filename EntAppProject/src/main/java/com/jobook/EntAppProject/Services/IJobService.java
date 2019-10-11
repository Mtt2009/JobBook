package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

public interface IJobService {
	/**
	 * Get all jobs that related to userId provided by looking at the employee and customer Id
	 * @param userId
	 * @return
	 */
	List<Job> getUsersRelatedJobs(int userId);
	
	/**
	 * Searches all jobs by a search term and returns jobs that the short description contains the search term
	 * @param searchTerm
	 * @return
	 */
	List<Job> searchJobByName(String searchTerm);
}
