package com.rajeshDyadav.outerclass;

public class OuterClass_1
{
    public OuterClass_1()
    {
	System.out.println("OuterClass Constructor");
    }
    protected class InnerClassTest
    {
	public int i;
	public InnerClassTest()
	{
	    i = 100;
	    System.out.println("InnerClass Constructor");
	}
    }
}
