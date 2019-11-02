package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateEmployee {

	public static void createEmployee() throws IOException {

		try (SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory())
		{

			Session session = factory.getCurrentSession();

			System.out.println("Enter first name");
			String firstName = ConsoleHelper.read();

			System.out.println("Enter last name");
			String lastName = ConsoleHelper.read();

			System.out.println("Enter company");
			String company = ConsoleHelper.read();

			Employee employee = new Employee(firstName, lastName, company);

			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();

			System.out.println("Employee added");;

		}

	}

}
