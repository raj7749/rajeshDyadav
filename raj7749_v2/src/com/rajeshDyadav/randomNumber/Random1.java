package com.rajeshDyadav.randomNumber;

import java.util.Random;

public class Random1
{
    public static void main(String args[])
    {
	String quesSets = "abc,def,xyz";
	String[] qSets = quesSets.split(",");	
	Random r = new Random();
	String selectedSet = qSets[r.nextInt(qSets.length)];
	System.out.println("^^^^^^^ Selected Question Set ..> " + selectedSet);
    }
}