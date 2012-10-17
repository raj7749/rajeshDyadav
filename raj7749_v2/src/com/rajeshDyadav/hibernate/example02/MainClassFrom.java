package com.rajeshDyadav.hibernate.example02;

import java.util.Iterator;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MainClassFrom
{

    public static void main(String[] args)
    {
	Session session = null;

	try
	{
	    // This step will read hibernate.cfg.xml and prepare hibernate for use
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    session = sessionFactory.openSession();

	    //Using from Clause
	    String SQL_QUERY = "from ContactBean contact";
	    Query query = session.createQuery(SQL_QUERY);
	    for (Iterator<?> it = query.iterate(); it.hasNext();)
	    {
		ContactBean contact = (ContactBean) it.next();
		System.out.println("ID: " + contact.getId());
		System.out.println("Name: " + contact.getName());
	    }

	    session.close();
	}
	catch (Exception e)
	{
	    System.out.println(e.getMessage());
	}
	finally
	{
	}

    }
}