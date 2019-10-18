package com.dhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class User {

	@Autowired
	private String name;
	@Autowired
	private String dept;
	@Autowired
	private String place;
	
	public User(String name, String dept, String place) {
		super();
		this.name = name;
		this.dept = dept;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
}
