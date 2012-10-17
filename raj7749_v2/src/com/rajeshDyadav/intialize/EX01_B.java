package com.rajeshDyadav.intialize;

public class EX01_B
{
    static int i = 10;
    {
	System.out.println("CLASS - B INITIALIZE BLOCK A");	
    }
    
    static
    {			
	System.out.println(i=+10);
	EX01_A a = new EX01_A();	
	EX01_B b = new EX01_B();
		
	System.out.println("CLASS - B STATIC BLOCK");
    }
    
    public EX01_B()
    {	
	System.out.println("CLASS - B CONSTRUCTOR");	
    }
    
    {	
	System.out.println("CLASS - B INITIALIZE BLOCK B");
    }
    
    static
    {	
	System.out.println(i+=10);
	System.out.println("CLASS - B STATIC BLOCK 2");
    }
}
