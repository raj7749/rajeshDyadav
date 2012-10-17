package com.rajeshDyadav.superNthis;

public class EX3_C extends EX3_B
{
    public EX3_C()
    {
	super.a = 10;
	super.b = 20;
	System.out.println("C");
    }
    
    public static void main(String args[])
    {
	EX3_C c = new EX3_C();
	c.a();	
	c.b();
	
	Object obj = new EX3_C();
	((EX3_C)obj).a();
	((EX3_C)obj).b();

	
    }
}
