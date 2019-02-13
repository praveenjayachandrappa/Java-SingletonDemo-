package com.test.singleton;

public class EagerInitializedSingleton {
	
		private static final EagerInitializedSingleton INSTANCE=new EagerInitializedSingleton();
		
		private EagerInitializedSingleton(){
			System.out.println("this is the private constructor of the class to restrict the access of class object outside the class..");
		}
		
		//global static method to return the instance of this class.
		
		public static EagerInitializedSingleton getInstance(){
			
			return INSTANCE;
		}

}

