package com.rajeshDyadav.exception;

public class ExceptionTest2
{
    public void one() throws NullPointerException
    {
	System.out.println("one method");
	String arr[] = null;	
	System.out.println(arr.length);
    }
    
    void Show()// throws NullPointerException
    {
	throw new NullPointerException();
    }
    
    public static void main(String args[])
    {
	ExceptionTest2 ET = new ExceptionTest2();
	ET.one();
//	ET.Show();
    }
}
