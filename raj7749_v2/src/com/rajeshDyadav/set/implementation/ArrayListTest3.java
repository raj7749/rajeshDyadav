package com.rajeshDyadav.set.implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3
{
    public static void main(String[] args)
    {
	ArrayList<String> fActionSetList = new ArrayList<String>();
	fActionSetList.add("one");fActionSetList.add("two");
	
	ArrayList<String> arrTemp = new ArrayList<String>();
	Iterator<String> it = fActionSetList.iterator();
	while (it.hasNext())
	{
	    arrTemp.add("'" + it.next() + "'");
	}
	String actionSet = arrTemp.toString().substring(1, arrTemp.toString().length() - 1);
	System.out.println(actionSet);
	actionSet = actionSet.substring(1, actionSet.length()-1);
	System.out.println(actionSet);
    }

}
