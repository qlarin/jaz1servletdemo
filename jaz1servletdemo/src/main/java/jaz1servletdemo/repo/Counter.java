package jaz1servletdemo.repo;

public class Counter {

	private static int counterValue;
	
	public static synchronized int getCounter(){
		return counterValue;
	}
	
	public static synchronized void reduceCounter(){
		counterValue--;
	}
	
	public static synchronized void setCounter(int value){
		counterValue = value;
	}
	
	
}
