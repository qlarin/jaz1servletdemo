package jaz1servletdemo.repo;

import java.util.ArrayList;
import java.util.List;

public class Register {

	private static List<String> registeredList = new ArrayList<String>();

	public static synchronized List<String> getRegisteredList() {
		return registeredList;
	}

	public static synchronized void addToList(String value){
		registeredList.add(value);
	}
	
}
