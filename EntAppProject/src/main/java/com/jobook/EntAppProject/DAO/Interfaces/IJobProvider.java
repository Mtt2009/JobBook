package com.jobook.EntAppProject.DAO.Interfaces;

import java.util.List;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

public interface IJobProvider {
	
	public List<Job> getUsersRelatedJobs(User user);
	
	public List<Job> searchJobByName(String searchTerm);
}
