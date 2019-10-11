package com.jobook.EntAppProject.DAO.Interfaces;

import java.util.List;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

public interface IJobProvider {
	
	public List<Job> GetUsersRelatedJobs(User user);
	
	public List<Job> SearchJobByName(String searchTerm);
}
