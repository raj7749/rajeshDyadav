package com.rajeshDyadav.hibernate.example02;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassDelete
{
    public static void main(String[] args)
    {  
	Session sess = null;
	try
	{
	    SessionFactory fact = new Configuration().configure().buildSessionFactory();
	    
	    sess = fact.openSession();
	    Transaction transaction = sess.beginTransaction();
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please Enter Id to delete..> ");
	    int id = scan.nextInt();
	    
	    String hql = "delete from ContactBean where id = :id";
	    Query query = sess.createQuery(hql);
	    query.setParameter("id", id);
	    
	    int row = query.executeUpdate();
	    if (row == 0)
	    {
		System.out.println("no row deleted");
	    }
	    else
	    {
		System.out.println("Deleted Row: " + row);
	    }
	    transaction.commit();
	    sess.close();
	    
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	    //System.out.println(e.getMessage());
	}
    }
}