package com.java.core;

public class ConstructorChaining {

	int x;
	double y;
	public ConstructorChaining() {
		this(10,12.5);
		System.out.println("default constructor or no-args constructor");
	}
	
     public ConstructorChaining(int a, double b) {
		
    	 x=a;
    	 y=b;
		System.out.println("parameterized constructor ");
	}
     
     
     
	public static void main(String[] args) {
		
		System.out.println("this is to demonstrate constructor chaining"); 
		
       new ConstructorChaining();
       
	}

}
