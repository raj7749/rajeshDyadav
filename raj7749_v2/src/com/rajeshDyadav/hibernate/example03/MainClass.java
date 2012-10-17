package com.rajeshDyadav.hibernate.example03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {
    public static void main(String[] args) {
	Session session = null;
	//Transaction transaction = null;
	try {
	    Configuration configuration = new Configuration().configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    session = sessionFactory.openSession();
	    
	    session.beginTransaction();
	    //transaction = session.beginTransaction();
	    
	    MyBean emp = new MyBean();
	    emp.setEmpCode("3331");
	    emp.setEmpName("RAJ");
	    emp.setDeptCode("0001");
	    emp.setEmpContact("AIRTEL");
	    emp.setEmpAddress("MUM");
	    emp.setEmpGender("Male");
	    session.save(emp);
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		session.flush();
		
		session.getTransaction().commit();
		//transaction.commit();
		
		session.close();
	    } catch (Exception e) {		
		e.printStackTrace();
	    }
	}
    }
}