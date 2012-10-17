package com.rajeshDyadav.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest
{
    public static void main(String[] args)
    {
	Collection<String> c = new ArrayList<String>();
	
	c.add("test1");
	c.add("test2");
	c.add("test3");
	
	Iterator<String> i = c.iterator();
	
	while(i.hasNext())
	{
	    System.out.println(i.next());
	}
	
    }
}
