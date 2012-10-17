/*
 * DateTime Converter & Formatter
 * By, 
 * Rajesh D. Yadav
 * raj.emb@gmail.com
 */

package com.rajeshDyadav.datetime;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateTimeTest1
{
    public String formatFrom;
    public String formatTo;

    public DateTimeTest1(String formatFrom, String formatTo)
    {
	this.formatFrom = formatFrom;
	this.formatTo = formatTo;
    }

    public Date toDateTime(String stringDate) throws ParseException
    {
	// SimpleDateFormat SDF = new SimpleDateFormat(formatFrom);
	// return (SDF.parse(stringDate));
	return ((new SimpleDateFormat(formatFrom)).parse(stringDate));
    }

    public String toStringDateTime(Date date)
    {
	// SimpleDateFormat SDF = new SimpleDateFormat(formatTo);
	// return (SDF.format(date));
	return ((new SimpleDateFormat(formatTo)).format(date));
    }

    public String formatDateTime(String stringDate) throws ParseException
    {
	return (toStringDateTime(toDateTime(stringDate)));
    }

    public java.sql.Date toSqlDate(Date date)
    {
	return (new java.sql.Date(date.getTime()));
    }
}

// http://download.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
// Letter | DateTime_Component | Presentation | Examples
// G | Era designator | Text | AD
// y | Year | Year | 1996; 96
// M | Month in year | Month | July; Jul; 07
// w | Week in year | Number | 27
// W | Week in month | Number | 2
// D | Day in year | Number | 189
// d | Day in month | Number | 10
// F | Day of week in month | Number | 2
// E | Day in week | Text | Tuesday; Tue
// a | Am/pm marker | Text | PM
// H | Hour in day (0-23) | Number | 0
// k | Hour in day (1-24) | Number | 24
// K | Hour in am/pm (0-11) | Number | 0
// h | Hour in am/pm (1-12) | Number | 12
// m | Minute in hour | Number | 30
// s | Second in minute | Number | 55
// S | Millisecond | Number | 978
// z | Time zone | General time zone | Pacific Standard Time; PST; GMT-08:00
// Z | Time zone | RFC 822 time zone | -0800
