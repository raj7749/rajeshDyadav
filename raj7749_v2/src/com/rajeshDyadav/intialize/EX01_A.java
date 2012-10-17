package com.rajeshDyadav.intialize;

public class EX01_A
{
    {
	System.out.println("CLASS - A INITIALIZE BLOCK A");	
    }
    
    static
    {		
	System.out.println("CLASS - A STATIC BLOCK");
    }
    
    public EX01_A()
    {	
	System.out.println("CLASS - A CONSTRUCTOR");	
    }
    
    {	
	System.out.println("CLASS - A INITIALIZE BLOCK B");
    }

    public static void main(String[] args)
    {
	EX01_A a = new EX01_A();
	EX01_A b = new EX01_A();
    }
}
