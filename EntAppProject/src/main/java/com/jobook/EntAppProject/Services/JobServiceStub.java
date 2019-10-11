package com.jobook.EntAppProject.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.model.Job;
import com.jobook.EntAppProject.model.User;

@Component
public class JobServiceStub implements IJobService {

	public List<Job> getUsersRelatedJobs(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Job> searchJobByName(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

}
