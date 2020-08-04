package com.coreJava.typeCasting;

//focus on data type
public  class PrimitiiveTypeCasting {

	static int a=10;
	static double d=a;
	static double f=10.5;
	static int i= (int) f;
	
	
	public static void display() {
		 System.out.println("narrowing =" +d);	
		 System.out.println("widdening =" +i);	
	}
	
	public static void main(String[] args) {
          
		display();

	}

}
