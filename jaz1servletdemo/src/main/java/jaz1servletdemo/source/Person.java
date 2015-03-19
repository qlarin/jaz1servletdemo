package jaz1servletdemo.source;

import java.util.ArrayList;
import java.util.List;

public class Person extends Unit {

	public Person(){
		super();
	}

	public Person(String firstName, String surName, String email, String employer, String job, List<String> list){
		super();
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setEmail(email);
		this.setEmployer(employer);
		this.setJob(job);
		this.setInfo(list);
	}
	
	private String firstName = " ";
	private String surName = " ";
	private String email = " ";
	private String employer = " ";
	private String job = " ";
	private List<String> info = new ArrayList<String>();
	
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

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<String> getInfo() {
		return info;
	}

	public void setInfo(List<String> info) {
		this.info = info;
	}
	
	
}
