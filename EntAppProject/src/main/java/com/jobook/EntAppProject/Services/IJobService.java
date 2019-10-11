package com.jobook.EntAppProject.Services;

import java.util.List;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

public interface IJobService {
	
	List<Job> getUsersRelatedJobs(int userId);
	
	List<Job> searchJobByName(String searchTerm);
}
