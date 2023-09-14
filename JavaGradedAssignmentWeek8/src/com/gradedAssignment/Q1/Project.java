package com.gradedAssignment.Q1;

import java.io.Serializable;

public class Project implements Serializable {
	String id;
	String name;
	int Experience;
	public Project(String id, String name, int experience) {
		super();
		this.id = id;
		this.name = name;
		Experience = experience;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return name;
	}
	public void setRole(String name) {
		this.name = name;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	@Override
	public String toString() {
		return "[Project id=" + id + ", role=" + name + ", Experience=" + Experience + "]"
				+ "\nhas following employees";
	}
	
}
