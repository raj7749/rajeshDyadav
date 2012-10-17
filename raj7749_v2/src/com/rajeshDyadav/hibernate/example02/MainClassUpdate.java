package com.rajeshDyadav.hibernate.example02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassUpdate
{
    public static void main(String[] args)
    {
	Session sess = null;
	try
	{
	    SessionFactory fact = new Configuration().configure().buildSessionFactory();
	    sess = fact.openSession();
	    Transaction tr = sess.beginTransaction();
	    ContactBean emp = (ContactBean) sess.get(ContactBean.class, new Integer(4));
	    emp.setName("PANDEY");
	    emp.setDepartment("Development");
	    emp.setContact("AIRTEL");
	    sess.update(emp);
	    tr.commit();
	    sess.close();
	    System.out.println("Update successfully!");
	}
	catch (Exception e)
	{
	    System.out.println(e.getMessage());
	}
    }
}