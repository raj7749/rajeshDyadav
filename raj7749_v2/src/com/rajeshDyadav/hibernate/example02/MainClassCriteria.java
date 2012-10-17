package com.rajeshDyadav.hibernate.example02;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class MainClassCriteria
{
    public static void main(String[] args)
    {
	Session session = null;
	try
	{
	    // This step will read hibernate.cfg.xml and prepare hibernate for use
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    session = sessionFactory.openSession();
	    //Criteria Query Example
	    Criteria crit = session.createCriteria(ContactBean.class);
	    List<?> contacts = crit.list();
	    for (Iterator<?> it = contacts.iterator(); it.hasNext();)
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
    }
}