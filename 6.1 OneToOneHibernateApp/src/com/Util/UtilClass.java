package com.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.EmpPersonaliNfo;
import com.Bean.EmployeeBean;

public class UtilClass {
	
	public static Session createConnection() {
		
		SessionFactory sf =new Configuration().addAnnotatedClass(EmployeeBean.class).addAnnotatedClass(EmpPersonaliNfo.class)
							.configure().buildSessionFactory();
		Session session = sf.openSession();
		return session;
		
	}

}
