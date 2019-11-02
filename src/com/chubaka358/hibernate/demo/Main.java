package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;
import com.chubaka358.session.SessionHelper;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

		boolean isExit = false;

		while (!isExit) {
			ConsoleHelper.write("\n\n\n\n\n\n\n");
			ConsoleHelper.write("1. Save an employee.");
			ConsoleHelper.write("2. Retrieve an employee by primary key.");
			ConsoleHelper.write("3. Find an employee for a given company.");
			ConsoleHelper.write("4. Delete an employee by primary key");
			ConsoleHelper.write("5. Exit");
			String line = ConsoleHelper.read();
			try {

				int n = Integer.parseInt(line);

				if (n <= 0 || n >= 6)
					ConsoleHelper.write("Enter a number from 1 to 5");

				if (n == 1) {
					CreateEmployee.createEmployee();
				} else if (n == 2) {
					ReadEmployees.readEmployee();
				} else if (n == 3) {
					ReadEmployees.findByCompany();
				} else if (n == 4) {
					DeleteEmployee.deleteEmployee();
				} else if (n == 5) {
					isExit = true;
					ConsoleHelper.close();
					SessionHelper.close();
				}
			} catch (Exception e){
				e.printStackTrace();
				ConsoleHelper.write("Incorrect input");
			}
		}
	}

}
