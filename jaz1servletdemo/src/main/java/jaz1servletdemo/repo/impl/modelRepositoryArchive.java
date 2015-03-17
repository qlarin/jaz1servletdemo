package jaz1servletdemo.repo.impl;

import jaz1servletdemo.source.*;
import jaz1servletdemo.repo.*;

public class modelRepositoryArchive implements IRepositoryArchive{

	private modelDatabase database = new modelDatabase();
	
	public IRepository<Person> getPersons(){
		return new modelPersonRepository(database);
	}
	
	
}
