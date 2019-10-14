package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

public interface IJobService {
	/**
	 * Get all jobs that related to userId provided by looking at the employee and customer Id
	 * @param userId the user id to get all the jobs for
	 * @return a list of jobs that the user has
	 * @throws Exception any exception in the underlying persistence
	 */
	List<Job> getUsersRelatedJobs(int userId) throws Exception;

	/**
	 * Searches all jobs by a search term and returns jobs that the short description contains the search term
	 * @param searchTerm the term to find the job by
	 * @throws Exception any exception in the underlying persistence
	 * @return list of jobs that matched the searchTerm
	 */
	List<Job> searchJobByName(String searchTerm) throws Exception;
}
