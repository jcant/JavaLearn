package com.gmail.gm.jcant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		String str = getGraph();
		stringToFile(str, new File("graph.txt"));
		System.out.println(str);
	}

	public static void stringToFile(String str, File f) {
		try (PrintWriter pw = new PrintWriter(f)) {
			pw.println(str);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static String getGraph() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 40; i++) {
			for (int j = 0; j < i; j++) {
				if (j == (39 - i)) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			for (int j = i; j < 40; j++) {
				if (j == (39 - i)) {
					sb.append(" ");
				} else {
					sb.append("*");
				}
			}
			sb.append(System.lineSeparator());
		}

		return sb.toString();

	}

}
