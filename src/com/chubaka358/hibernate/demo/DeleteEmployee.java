package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.session.SessionHelper;
import org.hibernate.Session;

import java.io.IOException;

public class DeleteEmployee {

	public static void deleteEmployee() throws IOException {

		ConsoleHelper.write("Enter primary key for delete employee");

		try {
			int id = Integer.parseInt(ConsoleHelper.read());

			Session session = SessionHelper.getCurrentSession();
			session.beginTransaction();

			session.createQuery(String.format("delete from Employee where id=%s", id)).executeUpdate();

			session.getTransaction().commit();

			ConsoleHelper.waitForInput();

		} catch (Exception e){
			e.printStackTrace();
			ConsoleHelper.write("Incorrect primary key format");
		}

	}

}
