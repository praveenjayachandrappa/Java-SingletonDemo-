package com.test.singleton;

//using Bill pugh Singleton implementation
/**
 * creating singleton class using inner static helper class
 * @author Praveen.j
 *
 */

public class BillPughSingleton {

	//creating singleton class using inner static helper class
	
	
	//delcare private constructor
	
	private BillPughSingleton() {
		
		System.out.println("private constructor...");
	}
	
	//inner  static class
	
	private static class SingletonHelper{
		
		private static final BillPughSingleton INSTANCE=new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance(){
		
		
		return SingletonHelper.INSTANCE;
	}
	
}
