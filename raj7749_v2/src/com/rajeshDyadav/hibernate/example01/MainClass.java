package com.rajeshDyadav.hibernate.example01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainClass {
    public static void main(String[] args) {
	Session session = null;
	Transaction transaction = null;

	try {
	    // This step will read hibernate.cfg.xml and prepare hibernate for
	    // use
	    System.out.println("RAJESH TESTING");	    	    
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    
	    session = sessionFactory.openSession();
	    transaction = session.beginTransaction();
	    // Create new instance of Contact and set values in it by reading
	    // them from form object
	    System.out.println("Inserting Record");
	    ContactBean emp = new ContactBean();
	    emp.setEmpCode("1234");
	    emp.setEmpName("RAJ");
	    emp.setDeptCode("0001");
	    emp.setEmpContact("AIRTEL");
	    emp.setEmpAddress("MUM");
	    emp.setEmpGender("Male");
	    session.save(emp);
	    System.out.println("Done");
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		// Actual contact insertion will happen at this step
		session.flush();
		transaction.commit();
		session.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
    }
}