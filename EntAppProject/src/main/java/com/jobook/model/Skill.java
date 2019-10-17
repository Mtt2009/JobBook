package com.jobook.model;

public class Skill {
	Integer id;
	String skill;
	
	public Skill(Integer id, String skill) {
		super();
		this.id = id;
		this.skill = skill;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
