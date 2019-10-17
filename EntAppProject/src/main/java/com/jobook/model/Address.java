package com.jobook.model;

import org.springframework.stereotype.Component;

public class Address {
	private String city, state, zip, lineOneDescription, lineTwoDescription;
	private Integer typeOfId;

	public Address(String city, String state, String zip, String line1, String line2, Integer id) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.lineOneDescription = line1;
		this.lineTwoDescription = line2;
		this.typeOfId = id;
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
		return lineOneDescription;
	}
	public void setLine1(String line1) {
		this.lineOneDescription = line1;
	}
	public String getLine2() {
		return lineTwoDescription;
	}
	public void setLine2(String line2) {
		this.lineTwoDescription = line2;
	}
	public Integer getId() {
		return typeOfId;
	}
	public void setId(Integer id) {
		this.typeOfId = id;
	}
}
