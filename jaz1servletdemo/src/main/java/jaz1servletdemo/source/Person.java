package jaz1servletdemo.source;

import java.util.ArrayList;
import java.util.List;

public class Person extends Unit {

	public Person(){
		super();
	}
	
	public Person(String firstName, String surName){
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.infos = new ArrayList<Info>();
	}
	
	public Person(String firstName, String surName, String email, String employer, String job){
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.employer = employer;
		this.job = job;
		this.infos = new ArrayList<Info>();
	}
	
	private String firstName = " ";
	private String surName = " ";
	private String email = " ";
	private String employer = " ";
	private String job = " ";
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

	public List<Info> getInfos() {
		return infos;
	}

	public void setInfos(List<Info> infos) {
		this.infos = infos;
	}
	
}
