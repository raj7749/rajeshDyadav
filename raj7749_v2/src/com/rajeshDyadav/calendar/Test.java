package com.rajeshDyadav.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test
{
    public static void main(String[] args)
    {
	test1();
	//test3();
	//test2();
	//test1();
	//Character.isDigit();
    }
    
    public static void test4()
    {
	Calendar cal = new GregorianCalendar(1986,Calendar.AUGUST,7);
	System.out.println(cal.get(Calendar.AM_PM));
    }

    public static void test3()
    {
	Calendar cal = new GregorianCalendar();
	System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	// if (cal.get(Calendar.HOUR_OF_DAY) > 12)
	// {
	// System.out.println(Calendar.HOUR_OF_DAY);
	// }
    }

    public static void test2()
    {
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
    }

    public static void test1()
    {
	Calendar cal = Calendar.getInstance();
	cal.clear();
	// cal.set(Calendar.DATE, 7);
	// cal.set(Calendar.MONTH, Calendar.AUGUST);
	// cal.set(Calendar.YEAR, 2011);
	cal.set(2011, CalendarTest1.month(8), 7); // Year, Month, Date		
	System.out.println(cal.getTime());
    }
}