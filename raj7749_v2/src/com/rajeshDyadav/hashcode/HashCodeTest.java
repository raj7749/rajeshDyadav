package com.rajeshDyadav.hashcode;

public class HashCodeTest
{
    public static void main(String[] args)
    {	
	String s1 = new String("rajesh");
	String s2 = "rajesh";
	String s3 = new String("yadav");
	String s4 = new String("yadav");
	 
	
	int i,j;
	i=10;
	j=20;
	
	Object object = new Object();
	object = new Integer(i);
	
	System.out.println(object.hashCode());
	System.out.println();
	System.out.println("s1 ..> " + s1.hashCode());
	System.out.println("s2 ..> " + s2.hashCode());
	System.out.println();
	System.out.println("s3 ..> " + s3.hashCode());
	System.out.println("s4 ..> " + s4.hashCode());			
    }
}
