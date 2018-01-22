package com.gmail.gm.jcant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String line = "";

		System.out.println("Enter your text (#save - to save and exit)");
		while (!(line = getLine()).equals("#save")) {
			sb.append(line);
			sb.append(System.lineSeparator());
		}

		saveToFile(new File("text.txt"), sb.toString());

	}

	public static String getLine() {

		return (new Scanner(System.in)).nextLine();
	}

	public static boolean saveToFile(File f, String text) {
		boolean result = true;
		try (PrintWriter pw = new PrintWriter(f)) {
			pw.print(text);
		} catch (IOException e) {
			System.err.println(e);
			result = false;
		}

		return result;
	}

}
