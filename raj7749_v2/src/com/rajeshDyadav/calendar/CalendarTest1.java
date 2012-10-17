package com.rajeshDyadav.calendar;

import java.util.Calendar;

public class CalendarTest1
{
    public static int month(int no)
    {
	switch (no)
	{
	case 1:
	    return Calendar.JANUARY;
	case 2:
	    return Calendar.FEBRUARY;
	case 3:
	    return Calendar.MARCH;
	case 4:
	    return Calendar.APRIL;
	case 5:
	    return Calendar.MAY;
	case 6:
	    return Calendar.JUNE;
	case 7:
	    return Calendar.JULY;
	case 8:
	    return Calendar.AUGUST;
	case 9:
	    return Calendar.SEPTEMBER;
	case 10:
	    return Calendar.OCTOBER;
	case 11:
	    return Calendar.NOVEMBER;
	case 12:
	    return Calendar.DECEMBER;
	default:
	    try
	    {
		throw new InvalidMonthException();
	    }
	    catch (InvalidMonthException e)
	    {
		e.printStackTrace();
	    }
	}
	return no;
    }
}
