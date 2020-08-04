package com.coreJava.abstraction;

public class AbstractionThroughInterfaceImpl implements AbstrcationThroghInterface{

	public void display() {
		System.out.println("thid id overriedn method");
		
	}
	
	 public static void main(String args[]) {
		 AbstractionThroughInterfaceImpl abstractionThroughInterfaceImpl=new AbstractionThroughInterfaceImpl();
		 abstractionThroughInterfaceImpl.display();
		 System.out.println("accessing the interface variable=" +abstractionThroughInterfaceImpl.a);
	 }

}
