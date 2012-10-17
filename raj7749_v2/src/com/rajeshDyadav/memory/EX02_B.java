package com.rajeshDyadav.memory;

public class EX02_B
{
    public static void main(String args[])
    {
	Runtime r = Runtime.getRuntime();
	
	System.out.println(r.availableProcessors());
	System.out.println((r.freeMemory()/1024)/1024 + "MB");
	System.out.println((r.maxMemory()/1024)/1024 + "MB");
	System.out.println((r.totalMemory()/1024)/1024 + "MB");
	
	r.load("/home/ryadav/15.2.32_TR1ISUN003_UT.ods");

	System.out.println((r.freeMemory()/1024)/1024 + "MB");
	System.out.println((r.maxMemory()/1024)/1024 + "MB");
	System.out.println((r.totalMemory()/1024)/1024 + "MB");

    }
}
