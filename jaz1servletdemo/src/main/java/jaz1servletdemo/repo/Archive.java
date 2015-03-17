package jaz1servletdemo.repo;

import java.util.*;
import jaz1servletdemo.source.Person;

public class Archive {

private List<Person> database = new ArrayList<Person>();
	
	public void add(Person person){
		Person newPerson = new Person(person.getFirstName(), person.getSurName());
		database.add(newPerson);
	}
	
	public List<Person> getAll(){
		return database;
	}
}
