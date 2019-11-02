package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.hibernate.demo.entity.Employee;
import com.chubaka358.session.SessionHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateEmployee {

	public static void createEmployee() throws IOException {

		Session session = SessionHelper.getCurrentSession();

		ConsoleHelper.write("Enter first name");
		String firstName = ConsoleHelper.read();

		ConsoleHelper.write("Enter last name");
		String lastName = ConsoleHelper.read();

		ConsoleHelper.write("Enter company");
		String company = ConsoleHelper.read();

		Employee employee = new Employee(firstName, lastName, company);

		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();

		ConsoleHelper.write("Employee added");

		ConsoleHelper.write("\n\nEnter any symbol to continue..");
		ConsoleHelper.read();

	}
}
