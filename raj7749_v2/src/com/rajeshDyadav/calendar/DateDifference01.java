package com.rajeshDyadav.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDifference01 {
    public static void main(String[] args) throws ParseException {
	String sdate1 = "7/9/2012";
	String sdate2 = "7/10/2012";

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar date1 = Calendar.getInstance();
	date1.setTime(sdf.parse(sdate1));
	Calendar date2 = Calendar.getInstance();
	date2.setTime(sdf.parse(sdate2));
	System.out.println(daysBetween(date1, date2));
    }

    public static long daysBetween(Calendar startDate, Calendar endDate) {
	Calendar date = (Calendar) startDate.clone();
	long daysBetween = 0;
	while (date.before(endDate)) {
	    date.add(Calendar.DAY_OF_MONTH, 1);
	    daysBetween++;
	}
	return daysBetween;
    }
}
