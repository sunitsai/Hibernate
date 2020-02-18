package com.util;
/*
for every database operation one this we need and that is
Session so we create static method (createSession)
which return Session

*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentUtil {

	public static Session createSession()
	{
		SessionFactory sf=new Configuration()
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}
}
