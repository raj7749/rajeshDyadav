package com.rajeshDyadav.string;

import java.util.StringTokenizer;

public class StringTokennizer
{
    public static void main1(String[] args)
    {
	String lot_no = "1001,1180174,990903";
	String tmp;
	StringTokenizer st = new StringTokenizer(lot_no, ",");
	while (st.hasMoreTokens())
	{
	    tmp = st.nextToken();
	    System.out.println(tmp);
	}
    }
}
