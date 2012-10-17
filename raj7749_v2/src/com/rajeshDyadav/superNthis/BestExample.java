package com.rajeshDyadav.superNthis;

public class BestExample extends BaseClass
{
    int a, b;       
    
    BestExample(int a, int b)
    {
	super(a+1,b+1); // THIS MUST BE THE FIRST CALL
	this.a = (a-1);
	this.b = (b-1);
	//super.a = (a*a);
	//super.b = (b*b);
	
	System.out.println("a --> " + a);
	System.out.println("b --> " + b);
	System.out.println("this.a --> " + this.a);
	System.out.println("this.b --> " + this.b);
	System.out.println("super.a --> " + super.a);
	System.out.println("super.b --> " + super.b);
    }
    
    void Process(int a, int b)
    {
	this.a = (a-1);
	this.b = (b-1);
	super.a = (a+1);
	super.b = (b+1);	
	
	
	System.out.println("a --> " + a);
	System.out.println("b --> " + b);
	System.out.println("this.a --> " + this.a);
	System.out.println("this.b --> " + this.b);
	System.out.println("super.a --> " + super.a);
	System.out.println("super.b --> " + super.b);
    }
    
    public static void main(String args[])
    {
	BestExample be = new BestExample(10,20);
	//BestExample be = new BestExample();
	be.Process(100, 200);
    }
}
