package com.java.core;

/*
 * when you create static inner class , in order to access its member you have to instantiate static class.
 * 
 * but when you create a static method in non-static class , you can call a method without using reference
 *of either  non-static class or static class 
 *two things we need to observe
 *1. we are creating non-static method inside a static class.
 *2.instantiating static object using "out class name" but not with the object
 * 
 * 
 */
public class StaticInnerClass {

	int a=10;
	
	public StaticInnerClass() {
		System.out.println("this is outer non-statci class");
	}
	
	public void outerMethod() {
		System.out.println(a);
		
	}
	
	//this is static inner class
	public static class Static{
		public static void dispaly() {
		
			System.out.println("static class");
		}
		public void dispaly2() {
			
			System.out.println("this is non-static method inside a static class");
		}
	}
	
	public static void main(String [] args) {
		StaticInnerClass staticInnerClass=new StaticInnerClass();
		staticInnerClass.outerMethod();
		StaticInnerClass.Static staticClass=new StaticInnerClass.Static();  //this creates object of static inner class using outer class
		staticClass.dispaly();
		staticClass.dispaly2();
		
	}
}
