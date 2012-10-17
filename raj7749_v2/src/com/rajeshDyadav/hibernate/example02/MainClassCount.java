package com.rajeshDyadav.hibernate.example02;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClassCount
{
    public static void main(String[] args)
    {
	Session sess = null;
	int count = 0;
	try
	{
	    SessionFactory fact = new Configuration().configure().buildSessionFactory();
	    sess = fact.openSession();
	    String SQL_QUERY = "select count(*) from ContactBean cb group by cb.id";
	    Query query = sess.createQuery(SQL_QUERY);
	    for (Iterator<?> it = query.iterate(); it.hasNext();)
	    {
		it.next();
		count++;
	    }
	    System.out.println("Total rows: " + count);
	    sess.close();
	}
	catch (Exception e)
	{
	    System.out.println(e.getMessage());
	}
    }
}