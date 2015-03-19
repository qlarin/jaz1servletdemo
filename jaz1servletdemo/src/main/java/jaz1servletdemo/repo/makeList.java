package jaz1servletdemo.repo;

import java.util.List;

public class makeList {

	private Boolean notNull = true;
	
	public void makeNewList(List<String> valuelist, String value){
		checkString(value);
		if(getStan() != false){
			addToList(valuelist, value);
		}
	}
	
	public void checkString(String value){
		if(value.equals(null)){
			notNull = false;
		}
	}
	
	public boolean getStan(){
		return notNull;
	}
	
	public void addToList(List<String> list, String value){
		list.add(value);
	}
	
}
