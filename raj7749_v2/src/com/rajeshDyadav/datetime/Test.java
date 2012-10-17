package com.rajeshDyadav.datetime;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test
{
    public static void fNextnPreviosDate() throws ParseException
    {
	String day, month, year;
	day = "17";
	month = "3";
	year = "2011";
	String strDate = day + "-" + month + "-" + year;
	System.out.println("String Date ..> " + strDate);

	int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
	// Date date = new Date();
	Date date = ((new SimpleDateFormat("dd-M-yyyy")).parse(strDate));
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy");
	String prevDate = dateFormat.format(date.getTime() - MILLIS_IN_DAY);
	String currDate = dateFormat.format(date.getTime());
	String nextDate = dateFormat.format(date.getTime() + MILLIS_IN_DAY);
	System.out.println("Previous date: " + prevDate);
	System.out.println("Current date: " + currDate);
	System.out.println("Next date: " + nextDate);
    }

    public static void main26032011(String[] args)
    {
	String day, month, year;
	day = "17";
	month = "3";
	year = "2011";
	String strDate = day + "-" + month + "-" + year;
	System.out.println("String Date ..> " + strDate);

	int d;
	d = Integer.parseInt(day);
	d++;
	System.out.println("Day ..> " + d);
    }

    public static void mmmain(String[] args) throws ParseException
    {
	DateTimeTest1 DT1 = new DateTimeTest1(null, null);
	DT1.formatTo = "hh 'o''clock' a, zzzz";
	String strdate;
	strdate = DT1.toStringDateTime(new Date());
	System.out.println(strdate);
    }

    public static void mmain(String[] args) throws ParseException
    {
	DateTimeTest1 DT1 = new DateTimeTest1(null, null);
	DT1.formatFrom = "dd-MM-yy HH:mm:ss";
	DT1.formatTo = "zzzz EEEE, dd-MMMM-yyyy hh:mm:ss:SSSS";
	// Date date = new Date();
	java.util.Date date = DT1.toDateTime("07-08-86 13:27:00");
	System.out.println(date);
	String result = DT1.toStringDateTime(date);
	System.out.println(result);
    }

    public static void main123123123(String[] args) throws ParseException
    {
	DateTimeTest1 DT1 = new DateTimeTest1("dd/MM/yy", "dd/MM/yy");

	String dueDate = "12/07/11";
	java.sql.Date incidentDate = new java.sql.Date(new Date().getTime());
	System.out.println("dueDate ..> " + dueDate);
	System.out.println("incidentDate ..> " + incidentDate);

	long dd, id, id2;

	Calendar cal = Calendar.getInstance();
	java.sql.Date dueDate2 = new java.sql.Date(DT1.toDateTime(dueDate).getTime());
	cal.clear();
	cal.setTime(dueDate2);
	cal.set(Calendar.HOUR_OF_DAY, 0);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	dd = cal.getTimeInMillis();
	cal.clear();
	cal.setTime(incidentDate);
	cal.set(Calendar.HOUR_OF_DAY, 0);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	id = cal.getTimeInMillis();
	cal.add(Calendar.DATE, 30);
	id2 = cal.getTimeInMillis();

	System.out.println(dd == id);
	System.out.println(dd < id);
	System.out.println(dd > id2);
    }
    
    /*
    public static void main(String args[]) throws ITMException, Exception
    {
	GenericUtility genericUtility = GenericUtility.getInstance();
	Timestamp ts = new Timestamp(new java.util.Date().getTime());
	SimpleDateFormat sdf = new SimpleDateFormat();
	sdf.applyPattern(genericUtility.getApplDateTimeFormat());
	
	//System.out.println(sdf.format(new Timestamp(new java.util.Date().getTime())));
	System.out.println(sdf.format(new java.util.Date()));
    }
    */
    /*
    private java.sql.Timestamp getCurrdateTimestamp()
    {
	GenericUtility genericUtility = GenericUtility.getInstance();
	Timestamp timestamp = null;
	try
	{
	    java.util.Date date = null;
	    timestamp = new Timestamp(System.currentTimeMillis());
	    SimpleDateFormat simpledateformat = new SimpleDateFormat(genericUtility.getDBDateFormat());
	    date = simpledateformat.parse(timestamp.toString());
	    timestamp = Timestamp.valueOf(simpledateformat.format(date).toString() + " 00:00:00.0");
	}
	catch (Exception exception)
	{
	    System.out.println("Exception in [TrainingEvent] getCurrdateAppFormat " + exception.getMessage());
	}
	return timestamp;
    }
    */

}
