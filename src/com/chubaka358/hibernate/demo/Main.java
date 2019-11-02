package com.chubaka358.hibernate.demo;

import com.chubaka358.console.ConsoleHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {

		boolean isExit = false;

		while (!isExit) {
			System.out.println("\n\n\n\n\n\n\n");
			System.out.println("1. Save an employee.");
			System.out.println("2. Retrieve an employee by primary key.");
			System.out.println("3. Find an employee for a given company.");
			System.out.println("4. Delete an employee by primary key");
			System.out.println("5. Exit");
			String line = ConsoleHelper.read();
			try {

				int n = Integer.parseInt(line);

				if (n <= 0 || n >= 6)
					System.out.println("Enter a number from 1 to 5");

				if (n == 1) {
					CreateEmployee.createEmployee();
				} else if (n == 2) {

				} else if (n == 3) {

				} else if (n == 4) {

				} else if (n == 5) {
					isExit = true;
				}
			} catch (Exception e){
				System.out.println("Incorrect input");
			}
		}
	}

}
