package com.test;
/**
 * This is Singleton class
 * @author Praveen.j
 */

public class Test {

	private static volatile Test test=null;
	private static Object mutex=new Object();
	
	private Test(){
		System.out.println("Private constructor");
	}
	
	public static Test getInstance(){
		
		
		if(test==null){
			synchronized (mutex) {
				test = new Test();
				return test;
			}
		} 
		
		return test;
	}
	
	
}
