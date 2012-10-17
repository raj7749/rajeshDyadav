package com.rajeshDyadav.memory;

public class EX01_A
{
    {
	//System.out.println((Runtime.getRuntime()).freeMemory());
    }
    
    static void one(int i)
    {
	two(i);
    }
    
    static void two(int j)
    {	
	one(j);	
    }
            
    public static void main(String[] args)
    {	
	EX01_A a;	
	
	System.out.println("free memory ..> " + ((Runtime.getRuntime().freeMemory())/1024)/1024);
	System.out.println("max memory ..> " + ((Runtime.getRuntime().maxMemory())/1024)/1024);
	System.out.println("total memory ..> " + ((Runtime.getRuntime().totalMemory())/1024)/1024);
	
	System.out.println("please wait....");
	
	System.gc();
	
	long i=0;
	while(i<999999999)
	{	    
	    long j = i++;
	    j = j++;
	    a = new EX01_A();
	   System.out.print(j);	    
	}
	
	System.out.println("free memory ..> " + ((Runtime.getRuntime().freeMemory())/1024)/1024);
	System.out.println("max memory ..> " + ((Runtime.getRuntime().maxMemory())/1024)/1024);
	System.out.println("total memory ..> " + ((Runtime.getRuntime().totalMemory())/1024)/1024);
    }
}
