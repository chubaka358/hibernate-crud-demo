package com.chubaka358.session;

import com.chubaka358.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHelper {

	private static SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public static Session getCurrentSession(){
		return factory.getCurrentSession();
	}

	public static void close(){
		factory.close();
	}
}
