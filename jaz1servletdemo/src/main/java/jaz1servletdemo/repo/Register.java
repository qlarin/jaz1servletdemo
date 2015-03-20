package jaz1servletdemo.repo;

import java.util.ArrayList;
import java.util.List;

public class Register {

	private static List<String> registeredList = new ArrayList<String>();

	public static List<String> getRegisteredList() {
		return registeredList;
	}

	public static void addToList(String value){
		registeredList.add(value);
	}
	
}
