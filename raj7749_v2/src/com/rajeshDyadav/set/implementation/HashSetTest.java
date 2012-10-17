package com.rajeshDyadav.set.implementation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest
{
    public static void main(String[] args)
    {
	//Collection<String> set = new HashSet<String>();
	Set<String> set2 = new HashSet<String>();
	HashSet<String> set = new HashSet<String>();
	set.add("one");set.add("two");set.add("three");
	set2.add("one");set2.add("two");set2.add("three");
	System.out.println(set.hashCode());
	System.out.println(set2.hashCode());
	
	String s = new String("aaaaaaa");
	String s2 = new String("aaaaaaa");
	System.out.println(s.hashCode());
	System.out.println(s2.hashCode());
	
	set.add(s);
	set.add(s2);
    }
}
