package com.rajeshDyadav.set.implementation;

import java.util.HashSet;

public class ABTest
{
    public static void main(String[] args)
    {
	HashSet set = new HashSet();
	set.add(new A());
	set.add(new B());
	System.out.println(set.size());
	System.out.println((new A()).equals(new A()));
	System.out.println((new String("raj")).equals(new String("raj")));
	System.out.println((new A()).hashCode());
	System.out.println((new A()).hashCode());
	
	double a;
	Double b;
	
	int c = 11;
	Double d = new Double(c);
	
	a = c;
	b = new Double(c);
	
	System.out.println(new String("rajesh").hashCode());
	System.out.println(new String("rajesh").hashCode());
	System.out.println(new String("rajesh").hashCode());
		
	//A a1 = set.;
	//B a2;
	
	//System.out.println(a1.hashCode());
	
	//System.out.println();
	//A a = new A();
	//B b = new B();
	//System.out.println(a.equals(b));
    }
}
