package com.rajeshDyadav.string;

public class StringBufferTest01
{
    public static void main(String[] args)
    {
	StringBuffer sb = new StringBuffer();
	System.out.println("Default Capacity ..> " + sb.capacity());	
	sb.ensureCapacity(100);
	System.out.println("New Capacity ..> " + sb.capacity());
    }
}
