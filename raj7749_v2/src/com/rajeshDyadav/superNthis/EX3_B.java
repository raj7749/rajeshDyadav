package com.rajeshDyadav.superNthis;

public class EX3_B extends EX3_A
{
    int a, b;
    
    public EX3_B()
    {
	super.a = 1;
	super.b = 2;
	System.out.println("B");
    }
    
    public void b()
    {
	System.out.println("B ..> " + a + " " + b);
    }
    
    public static void main(String args[])
    {
	EX3_B b = new EX3_B();
	b.a();
    }
}
