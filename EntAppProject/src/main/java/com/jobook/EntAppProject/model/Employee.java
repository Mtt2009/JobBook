package com.jobook.EntAppProject.model;

import java.util.List;

public class Employee extends User {
	private String preferredPaymentMethod;
	private Double averageRating;
	private List<Job> jobHistory, currentJobs;
	private List<Skill> skills;
	
	public Employee(Address address, String firstName, String lastName, String userName, String password, String email,
			Integer id, Integer addressId) {
		super(address, firstName, lastName, userName, password, email, id, addressId);
		// TODO Auto-generated constructor stub
	}

	public String getPreferredPaymentMethod() {
		return preferredPaymentMethod;
	}

	public void setPreferredPaymentMethod(String preferredPaymentMethod) {
		this.preferredPaymentMethod = preferredPaymentMethod;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public List<Job> getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(List<Job> jobHistory) {
		this.jobHistory = jobHistory;
	}

	public List<Job> getCurrentJobs() {
		return currentJobs;
	}

	public void setCurrentJobs(List<Job> currentJobs) {
		this.currentJobs = currentJobs;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
