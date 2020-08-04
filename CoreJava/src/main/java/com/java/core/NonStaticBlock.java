package com.java.core;

public class NonStaticBlock {
	
	
	public NonStaticBlock(){
		
		super();
		
		System.out.println("The constructor");
	}

	static{
		System.out.println("Static block: its always loaded during the class loading i.e before the object instantiate");
	}
	
	{
		System.out.println("non-static block");   //without creating object it wont work
	}
	
	public static void display() {
		System.out.println("static method");
	}
	
	public static void main(String [] args) {
		display();
		System.out.println("this is to understand static and non-static block");  //this will execute after non-static block
		NonStaticBlock nonStaticBlock = new NonStaticBlock();
		display();
	}
}
