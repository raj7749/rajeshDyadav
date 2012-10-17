package com.rajeshDyadav.hibernate.example02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClassInsert
{
    public static void main(String[] args)
    {
	Session session = null;
	Transaction transaction = null;	
	ServiceRegistry serviceRegistry = null;
	Configuration configuration = null;
	SessionFactory sessionFactory = null;
	
	try
	{
	    // This step will read hibernate.cfg.xml and prepare hibernate for use
	    System.out.println("RAJESH TESTING");
	    	    
	    //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();//depreciated
	    
	    //serviceRegistry = new ServiceRegistryBuilder().applySettings(new Configuration().configure().getProperties()).buildServiceRegistry();	    
	    //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
	    
	    //sessionFactory = new Configuration().configure().buildSessionFactory(new ServiceRegistryBuilder().applySettings((new Configuration().configure()).getProperties()).buildServiceRegistry());
	    
	    
	    configuration = new Configuration().configure();
	    //configuration.configure();
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    
	    
	    session = sessionFactory.openSession();	    
	    transaction = session.beginTransaction();
	    //Create new instance of Contact and set values in it by reading them from form object
	    System.out.println("Inserting Record");
	    ContactBean emp = new ContactBean();
	    //emp.setId(1235);
	    emp.setName("RAJ");
	    emp.setDepartment("Dev");
	    emp.setContact("AIRTEL");
	    session.save(emp);	    
	    System.out.println("Done");
	}
	catch (Exception e)
	{
	    e.printStackTrace();	    
	}
	finally
	{
	    // Actual contact insertion will happen at this step
	    session.flush();
	    transaction.commit();
	    session.close();
	}
    }
}