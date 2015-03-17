package jaz1servletdemo.source;

import java.util.*;

public class Person{

	public Person(){
		super();
	}
	
	public Person(String firstName, String surName){
		super();
		this.firstName = firstName;
		this.surName = surName;
	
	}
	
	private String firstName = " ";
	private String surName = " ";
	private String email;
	private String employee;
	private String job;
	
	private List<Info> infos;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<Info> getInfos() {
		return infos;
	}

	public void setInfos(List<Info> infos) {
		this.infos = infos;
	}
	
	
}
