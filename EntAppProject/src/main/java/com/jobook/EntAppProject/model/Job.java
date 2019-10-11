package com.jobook.EntAppProject.model;

import java.util.Date;

public class Job {
	private Integer jobId, customerId, employeeId;
	private Customer customer;
	private Employee employee;
	private String longDesc, shortDesc;
	private Date startDate, endDate;
	private Boolean hasBeenReviewed, completed;
	private Double price;
	private Review review;
	
	public Job(Integer jobId, Integer customerId, Integer employeeId, Customer customer, Employee employee, String longDesc, String shortDesc, Date startDate,
			Date endDate, Double price) {
		super();
		this.jobId = jobId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.longDesc = longDesc;
		this.shortDesc = shortDesc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hasBeenReviewed = false;
		this.completed = false;
		this.price = price;
	}	
	
	public Job(Integer jobId, Integer customerId, Integer employeeId, Customer customer, Employee employee, String longDesc, String shortDesc, Date startDate,
			Date endDate, Boolean hasBeenReviewed, Boolean completed, Double price, Review review) {
		super();
		this.jobId = jobId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.longDesc = longDesc;
		this.shortDesc = shortDesc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hasBeenReviewed = hasBeenReviewed;
		this.completed = completed;
		this.price = price;
		this.review = review;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Boolean getHasBeenReviewed() {
		return hasBeenReviewed;
	}
	public void setHasBeenReviewed(Boolean hasBeenReviewed) {
		this.hasBeenReviewed = hasBeenReviewed;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
