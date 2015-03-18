package jaz1servletdemo.repo;

import java.util.*;

import jaz1servletdemo.source.Info;
import jaz1servletdemo.source.Person;

public class Archive {

private ArrayList<Person> database = new ArrayList<Person>();
private ArrayList<Info> infobase = new ArrayList<Info>();	

	public void add(Person person, Info info){
		Person newPerson = new Person(person.getFirstName(), person.getSurName(), person.getEmail(), person.getEmployer(), person.getJob());
		Info newInfo = new Info(info.getInf1(), info.getInf2(), info.getInf3(), info.getInf4(), info.getInf5());
		database.add(newPerson);
		infobase.add(newInfo);
	}
	
	public List<Person> getAll(){
		return database;
	}
	public List<Info> getAllInfo(){
		return infobase;
	}
	
	
	
}
