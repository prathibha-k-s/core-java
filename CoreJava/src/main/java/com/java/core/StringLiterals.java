package com.java.core;

//when you initailise the String object then the string object will create (7,8)
public class StringLiterals {

	public static void main(String[] args) {
		String s1= "prathi";   	
		s1="prathi2"; //string literals //this will create new instance when change the value
		String s2=new String("prathi");
		String s3= new String("prathi");  //creating string object using new //this both s3 and s2 are refering to same reference (same hash code)

		StringBuilder  s4= new StringBuilder("prathi"); 
		StringBuilder  s5= new StringBuilder("prathi"); 
		StringBuffer  s6= new StringBuffer("prathi"); 
		StringBuffer  s7= new StringBuffer("prathi"); 
		
	System.out.println("String Class S1 and the hash code is"+s1.hashCode());
	System.out.println("String Class S2"+s2.hashCode());
	System.out.println("String Class S3"+s3.hashCode());
	System.out.println("StringBUilder  Class S4"+s4.hashCode());
	System.out.println("StringBuilder  Class S5"+s5.hashCode());
	System.out.println("StringBuffer  Class S6"+s6.hashCode());
	System.out.println("StringBuffer  Class S7"+s7.hashCode());
    System.out.println(s3==s2);
	System.out.println(s3.equals(s2));
	System.out.println(s1.compareTo(s2));
	

	}

}
