package com.rajeshDyadav.outerclass;

public class OuterClass_2 extends OuterClass_1
{
    public static void main(String[] args)
    {
	OuterClass_2 oc2 = new OuterClass_2();
	
	OuterClass_1 oc1 = new OuterClass_1();	 
	OuterClass_1.InnerClassTest ict1 = oc1.new InnerClassTest();
	
	System.out.println("------------------------");
	OuterClass_1.InnerClassTest ict2 = (new OuterClass_1()).new InnerClassTest();
	OuterClass_2.InnerClassTest ict3 = (new OuterClass_2()).new InnerClassTest();
	System.out.println("------------------------");
	System.out.println(ict2.i);
    }
}
