package com.rajeshDyadav.hibernate.example02;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class MainClassSelect
{
    public static void main(String[] args)
    {
	Session session = null;

	try
	{
	    // This step will read hibernate.cfg.xml and prepare hibernate for use
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    session = sessionFactory.openSession();

	    //Create Select Clause HQL
	    String SQL_QUERY = "select cb.id,cb.name,cb.contact from ContactBean cb";	    
	    Query query = session.createQuery(SQL_QUERY);
	    for (Iterator<?> it = query.iterate(); it.hasNext();)
	    {
		Object[] row = (Object[]) it.next();
		System.out.println("ID: " + row[0]);
		System.out.println("Name: " + row[1]);
		System.out.println("Contact: " + row[2]);
	    }

	    session.close();
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}
    }
}