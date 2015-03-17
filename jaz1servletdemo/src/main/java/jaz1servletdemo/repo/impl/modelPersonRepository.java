package jaz1servletdemo.repo.impl;

import java.util.*;
import jaz1servletdemo.source.Person;
import jaz1servletdemo.repo.IRepository;

public class modelPersonRepository implements IRepository<Person> {

	private modelDatabase database;
	
	public modelPersonRepository(modelDatabase database){
		this.database = database;
	}
	
	public void save(Person entity){
		database.persons.add(entity);
	}
	
	public void delete(Person entity){
		database.persons.remove(entity);
	}
	
	public void update(Person entity){
		
	}
	
	public Person get(int id){
		for (Person p: database.persons)
			if(p.getNumber()==id)
				return p;
		return null;
	}
	
	public List<Person> getAll(){
		return database.persons;
	}
}
