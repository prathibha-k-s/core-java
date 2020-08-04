package com.coreJava.abstraction;

//in concrete class we cant have abstract method.
public  class  AbstractMain extends AbstractDemo{

	
	//@Override
		public  void display() {
		System.out.println("this is overriden method ");	
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractMain abstractMain=new AbstractMain();
		abstractMain.show();  
		abstractMain.display();
		
	}

	

}
