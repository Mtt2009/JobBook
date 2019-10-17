package com.jobook.model;

public class Skill {
	Integer typeOfId;
	String skill;
	
	public Skill(Integer id, String skill) {
		super();
		this.typeOfId = id;
		this.skill = skill;
	}
	
	public Integer getId() {
		return typeOfId;
	}
	public void setId(Integer id) {
		this.typeOfId = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
