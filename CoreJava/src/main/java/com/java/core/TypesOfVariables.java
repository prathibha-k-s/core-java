package com.java.core;

 
//this program to demonstrate the type of variables

public class TypesOfVariables {
static int a=20;    //static variable
int c=10;          //instance variable
int n;

public TypesOfVariables(int b) {
	this.c=b;
}
private void display() {
	int i=1;
	int b=40;
	System.out.println("non-static variable " +this.c);
	System.out.println("static variable" +a);
	for(a=1;i<=10;i++) {
		System.out.println("number" +i+"=" +a);
		a++;
	
	}
}


public static void staticDisplay() {
	 int a=1;
	System.out.println(a);
	

}


	public static void main(String[] args) {
		
		TypesOfVariables typesOfVariables=new TypesOfVariables(100);
		typesOfVariables.c=50;
		staticDisplay();
        typesOfVariables.display();
        System.out.println(a);
        
        
        
        
	}

}
