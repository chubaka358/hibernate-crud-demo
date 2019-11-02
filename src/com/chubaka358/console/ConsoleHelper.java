package com.chubaka358.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static String read() throws IOException {
		return reader.readLine();
	}

	public static void close() throws IOException {
		reader.close();
	}

	public static void write(Object output){
		System.out.println(output);
	}

	public static void waitForInput() throws IOException {
		ConsoleHelper.write("\n\nEnter any symbol to continue..");
		ConsoleHelper.read();
	}

}
