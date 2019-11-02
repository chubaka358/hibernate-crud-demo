package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.hibernate.demo.entity.Employee;
import com.chubaka358.session.SessionHelper;
import org.hibernate.Session;

import java.io.IOException;

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

		ConsoleHelper.waitForInput();

	}
}
