package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.StudentBean;
import com.util.StudentUtil;

public class StudentDao {

	public static void insertStudent(StudentBean s) {
		
		Session session = StudentUtil.createSession();
		Transaction tr = session.beginTransaction();`
		session.save(s);
		tr.commit();
		session.close();
	}
	public static List<StudentBean> getallstudent(){
		
		Session session = StudentUtil.createSession();
		List<StudentBean> list = session.createQuery("from StudentBean").list();
		return list;
	}
	public static StudentBean getAllStudentById(int id) {
		Session session = StudentUtil.createSession();
		StudentBean s = session.get(StudentBean.class, id);
		return s; 
	}
	public static void updateStudent(StudentBean s) {
		
		Session session = StudentUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.update(s);
		tr.commit();
		session.close();
	}
	
	public static void deleteStudent(int id) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		StudentBean s=session.get(StudentBean.class, id);
		session.delete(s);
		tr.commit();
		session.close();
	}
}
