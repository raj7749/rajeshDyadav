package com.rajeshDyadav.interfacetest;

public class EX1_C extends EX1_B implements EX1_A
{
    public void show()
    {
	System.out.println("C");
    }
    public static void main(String args[])
    {
	EX1_C c = new EX1_C();
	c.show();
    }
}
