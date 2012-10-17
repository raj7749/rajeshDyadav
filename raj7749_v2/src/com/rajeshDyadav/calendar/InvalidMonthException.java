package com.rajeshDyadav.calendar;

public class InvalidMonthException extends Exception
{
    private static final long serialVersionUID = -2368989229197318470L;

    public InvalidMonthException()
    {
	super("INVALID MONTH");
    }
}