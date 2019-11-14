package com.jobook.EntAppProject.model;

public class Address {
	private String city, state, zip, line1, line2;
	private Integer id;

	public Address(String city, String state, String zip, String line1, String line2, Integer id) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.line1 = line1;
		this.line2 = line2;
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
