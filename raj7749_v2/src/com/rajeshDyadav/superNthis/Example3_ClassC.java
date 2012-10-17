package com.rajeshDyadav.superNthis;

public class Example3_ClassC extends Example2_ClassB
{
    public void test()
    {	
	super.test();
	System.out.println("Class C");
    }
    
    public static void main(String[] args)
    {
	Example3_ClassC  C = new Example3_ClassC();
	C.test();
    }
}
