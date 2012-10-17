package com.rajeshDyadav.set.implementation;

public class A
{
    String abc = "CLASS";

    private final char value[];
    private final int offset;
    private final int count;
    public A()
    {
	this.offset = 0;
	this.count = 0;
	this.value = new char[0];
    }

    private int hash; // Default to 0

    public int hashCode()
    {
	int h = hash;
	int len = count;
	if (h == 0 && len > 0)
	{
	    int off = offset;
	    char val[] = value;

	    for (int i = 0; i < len; i++)
	    {
		h = 31 * h + val[off++];
	    }
	    hash = h;
	}
	return h;
    }

}