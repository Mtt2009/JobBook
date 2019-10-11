package com.jobook.EntAppProject.model;

public class Review {
	private Integer employeeId, customerId, jobId;
	private String description, title;
	private Double rating;
	
	public Review(Integer employeeId, Integer customerId, Integer jobId, String description, String title, Double rating) {
		super();
		this.employeeId = employeeId;
		this.customerId = customerId;
		this.jobId = jobId;
		this.description = description;
		this.title = title;
		this.rating = rating;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	

}
