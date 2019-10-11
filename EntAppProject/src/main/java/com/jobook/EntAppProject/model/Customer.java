package com.jobook.EntAppProject.model;

import java.util.List;

import org.springframework.stereotype.Component;

public class Customer extends User {
	private String preferredPaymentMethod;
	private List<Job> orderHistory, currentOrders;
	private List<Review> reviews;
	
	public Customer(Address address, String firstName, String lastName, String userName, String password, String email,
			Integer id, Integer addressId, String userType) {
		super(address, firstName, lastName, userName, password, email, id, addressId, userType);
		// TODO Auto-generated constructor stub
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public void addNewJob(Job job) {
		this.currentOrders.add(job);
	}
	
	public void moveJobToHistory(Job job) throws Exception {
		int index = currentOrders.indexOf(job);
		
		if(index == -1)
			throw new Exception("Job does not exist in current orders list.");
		
		orderHistory.add(job);
		currentOrders.remove(index);
	}

	public String getPreferredPaymentMethod() {
		return preferredPaymentMethod;
	}

	public void setPreferredPaymentMethod(String preferredPaymentMethod) {
		this.preferredPaymentMethod = preferredPaymentMethod;
	}

	public List<Job> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(List<Job> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public List<Job> getCurrentOrders() {
		return currentOrders;
	}

	public void setCurrentOrders(List<Job> currentOrders) {
		this.currentOrders = currentOrders;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
}
