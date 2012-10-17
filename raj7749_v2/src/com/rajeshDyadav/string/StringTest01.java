package com.rajeshDyadav.string;

import java.util.Random;

public class StringTest01
{
    public static void main(String[] args)
    {
	String s1 = "A";
	char c1 = s1.charAt(0);
	System.out.println(c1);
	
	String s = "";
	System.out.println(s.trim());
    }

    public static void main33(String[] args)
    {
	String A = "Test";
	String B = "Test";

	String C = new String("Test");
	String D = new String("Test");

	String E = A;
	String F = C;

	System.out.print(A.equals(C));
	System.out.print(A == C);

	System.out.print(A.equals(B));
	System.out.print(A == B);

	System.out.print(C.equals(D));
	System.out.print(C == D);

	System.out.print(A.equals(E));
	System.out.print(A == E);

	System.out.print(C.equals(F));
	System.out.print(C == F);

    }

    public static void main3(String args[])
    {
	String questSetId = "";
	String quesSets = questSetId;
	String[] qSets = quesSets.split(",");
	Random r = new Random();
	questSetId = qSets[r.nextInt(qSets.length)];
	System.out.println("questSetId ..> " + questSetId);
    }
}
