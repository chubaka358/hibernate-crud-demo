package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.hibernate.demo.entity.Employee;
import com.chubaka358.session.SessionHelper;
import org.hibernate.Session;

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

			ConsoleHelper.write("\n\nEnter any symbol to continue..");
			ConsoleHelper.read();

		} catch (Exception e) {
			e.printStackTrace();
			ConsoleHelper.write("Incorrect primary key format");
		}
	}

}
