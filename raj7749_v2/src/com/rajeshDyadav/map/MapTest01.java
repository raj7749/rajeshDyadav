package com.rajeshDyadav.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01
{
    public static void main(String[] args)
    {
	Map<String, String> map = System.getenv();
	Set<String> set = map.keySet();	
	Iterator<String> iterator = set.iterator();
	String key;
	while(iterator.hasNext())
	{
	    key = iterator.next();
	    System.out.println(key + " ..> " + map.get(key));
	}	
    }
}
