package com.test;

public class DriverDemo {
	
	public static void main(String[] args) {
		
		Test instance = Test.getInstance();
		
		Test instance2=Test.getInstance();
		System.out.println("test instance is crated only once..");
		
	}

}
