package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Bean.EmpPersonaliNfo;
import com.Bean.EmployeeBean;
import com.Util.UtilClass;

public class DaoClass {
	
	public static void insertEmp(EmployeeBean emp) {
		
		Session session = UtilClass.createConnection();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		
	}
	
	public static void insertEmpPersonalInfo(EmpPersonaliNfo epi) {
		
		Session session = UtilClass.createConnection();
		Transaction tr = session.beginTransaction();
		session.save(epi);
		tr.commit();
		session.close();
		
	}

}
