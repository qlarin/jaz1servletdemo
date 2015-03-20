package jaz1servletdemo.repo;

import java.util.*;

import jaz1servletdemo.source.Person;

public class Archive {

private ArrayList<Person> database = new ArrayList<Person>();

	public void add(Person person){
		Person newPerson = new Person(person.getFirstName(), person.getSurName(), person.getEmail(), person.getEmployer(), person.getJob(), person.getInfo());
		database.add(newPerson);
		Counter.reduceCounter();
	}
	
	public List<Person> getAll(){
		return database;
	}

}
