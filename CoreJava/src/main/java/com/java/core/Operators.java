package com.java.core;


public class Operators {

	char a;
	int c;
	String str= "saanvi";
	
	public void display() {
		System.out.println(" concatinating a string =" + str+a);  //if you add anything with string it will be string.
		System.out.println('a'+'c');  //if you concatenate character then it will give ascci values addedd
	}
	
	public static void main(String [] args) {
		Operators operators=new Operators();
		operators.display();
		}
		
}
