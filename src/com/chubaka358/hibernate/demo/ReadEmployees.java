package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.hibernate.demo.entity.Employee;
import com.chubaka358.session.SessionHelper;
import org.hibernate.Session;

import java.io.IOException;
import java.util.List;

public class ReadEmployees {

	public static void readEmployee(){
		try {
			ConsoleHelper.write("Enter primary key");
			int id = Integer.parseInt(ConsoleHelper.read());

			Session session = SessionHelper.getCurrentSession();
			session.beginTransaction();

			Employee employee = session.get(Employee.class, id);
			ConsoleHelper.write("\n\n");
			ConsoleHelper.write(employee);

			session.getTransaction().commit();

			ConsoleHelper.waitForInput();

		} catch (Exception e) {
			e.printStackTrace();
			ConsoleHelper.write("Incorrect primary key format");
		}
	}

	public static void findByCompany() throws IOException {

		ConsoleHelper.write("Enter company name");

		String company = ConsoleHelper.read();

		Session session = SessionHelper.getCurrentSession();

		session.beginTransaction();

		List<Employee> employees = session.createQuery(String.format("from Employee s where s.company='%s'", company))
				.getResultList();

		ConsoleHelper.write("\n\n");

		for(Employee employee : employees){
			ConsoleHelper.write(employee);
		}

		session.getTransaction().commit();

		ConsoleHelper.waitForInput();

	}

}
