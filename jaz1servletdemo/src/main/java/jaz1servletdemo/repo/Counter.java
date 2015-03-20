package jaz1servletdemo.repo;

public class Counter {

	private static int counterValue;
	
	public static int getCounter(){
		return counterValue;
	}
	
	public static void reduceCounter(){
		counterValue--;
	}
	
	public static void setCounter(int value){
		counterValue = value;
	}
	
	
}
