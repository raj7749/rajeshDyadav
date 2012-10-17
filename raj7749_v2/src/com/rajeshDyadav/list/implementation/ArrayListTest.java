package com.rajeshDyadav.list.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest
{
    public static void main(String[] args)
    {
	ArrayList<String> list = new ArrayList<String>();	
	//List<String> list = new ArrayList<String>();
	//Collection<String> list = new ArrayList<String>();
	
	list.add("one ");list.add("two ");list.add("three ");list.add("four ");	
	System.out.println("List ..> " + list.toString());

	System.out.println("\nway 1");
	for (String string : list) System.out.print(string);
	
	System.out.println("\n\nway 2");
	Iterator<String> it = list.iterator();		
	while(it.hasNext())
	{	    
	    System.out.print(it.next());	    
	    //it.remove();
	}
		
	System.out.println("\n\nway 3");
	ListIterator<String> li = list.listIterator(); // not supported if instance created in collection
	while(li.hasNext())
	{
	    //li.add("raj");	    
	    System.out.print(li.next());
	    //li.set("raj");//it replaces last 'next'
	}	
	//for (String string : list) System.out.print(string);
    }
}
