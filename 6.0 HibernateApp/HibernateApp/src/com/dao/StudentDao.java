package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {

	public static void insertStudent(Student s)
	{
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}
	public static List<Student> getAllStudent()
	{
		Session session=StudentUtil.createSession();
		List<Student> list=session.createQuery("from Student").list();
		return list;
	}
}
