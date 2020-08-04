package com.coreJava.encapsulation;

/*
 * Encapsulation mainly achieves data hiding by making data member as private and member function as public 
 * it provides security to data
 * it makes code flexible - either we can giive only read accessability or we can give write
 */
public class Encapsulation {

	private int a;
	private String name;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
