package jaz1servletdemo.repo;

import java.util.List;

public class makeList {

	private Boolean Null = false;
	
	public void makeNewList(List<String> valuelist, String value){
		checkString(value);
		if(getStan() != false){
			addToList(valuelist, value);
		}
	}
	
	public boolean checkString(String value){
		if(value.equals(null) || value.isEmpty() == true){
			Null = true;
		}
		return Null;
	}
	
	public boolean getStan(){
		return Null;
	}
	
	public void addToList(List<String> list, String value){
		list.add(value);
	}
	
}
