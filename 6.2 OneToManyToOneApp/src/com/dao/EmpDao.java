package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.bean.Emp;
import com.util.StudentUtil;

public class EmpDao {

	public static void insertEmp(Emp e)
	{
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
	
	public static void insertDept(Dept d)
	{
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
	}
	
	public static List<Dept> getAllDept()
	{
		Session session=StudentUtil.createSession();
		List<Dept> list=session.createQuery("from Dept").list();
		return list;
	}
	
}
