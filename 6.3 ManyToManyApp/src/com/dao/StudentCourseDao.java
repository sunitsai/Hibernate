package com.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Course;
import com.model.Student;
import com.util.HibernateUtil;

public class StudentCourseDao {

	public void addCourses(Course c)
	{
		Session session=HibernateUtil.getSession();
		Transaction tr=session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
	}
	public void addStudent(Student s)
	{
		Session session=HibernateUtil.getSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}
	
    
}
