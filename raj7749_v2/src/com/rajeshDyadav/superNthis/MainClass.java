package com.rajeshDyadav.superNthis;

public class MainClass extends BaseClass
{
    int a, b;
    
    MainClass(int a, int b)
    {	
	super(a, b); // call class BaseClass constructor
	
	System.out.println("MainClass Constructor");

	this.a = 77; // set class MainClass variable a
	this.b = 88; // set class MainClass variable b

	super.b = 100; // set class BaseClass variable b
	
	//System.out.println("super.a --> " + super.a);
	//System.out.println("super.b --> " + super.b);
    }
    
    public static void main(String args[])
    {
	BaseClass st = new MainClass(10, 20);	
	System.out.println(st.a);
	System.out.println(st.b);
	
	MainClass st2 = new MainClass(10, 20);	
	System.out.println(st2.a);
	System.out.println(st2.b); 
    }
}
