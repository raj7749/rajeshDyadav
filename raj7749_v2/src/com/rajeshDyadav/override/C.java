package com.rajeshDyadav.override;

public class C extends B
{
    public void show()
    {
	System.out.println("C");
    }
    public static void main(String args[])
    {
	//A a = (B) new C();
	//a.show();
	//B b = new C();	
	//b.show();	
	//C c = new C();
	//c.show();
	Object c1 = new B();
	((C) c1).show();
    }
}
