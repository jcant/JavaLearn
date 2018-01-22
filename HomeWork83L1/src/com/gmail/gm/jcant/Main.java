package com.gmail.gm.jcant;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File file = new File(".");
		printCatalogContent(file);

	}

	public static void printCatalogContent(File f) {
		if (f.isFile() || (!f.exists())) {
			System.out.println("It is not a directory or not exist!");
		} else {
			System.out.println("Directory '" + f + "' consist of:");
			File[] files = f.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file);
				}
			}
		}
	}

}
