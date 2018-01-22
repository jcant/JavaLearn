package com.gmail.gm.jcant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 1000);
			}
		}

		String str = arrayToString(array);
		System.out.println(str);

		File file = new File("matrix.txt");
		stringToFile(str, file);
	}

	public static void stringToFile(String str, File f) {
		try (PrintWriter pw = new PrintWriter(f)) {
			pw.println(str);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static String arrayToString(int[][] arr) {
		StringBuilder sb = new StringBuilder();
		for (int[] row : arr) {
			for (int col : row) {
				sb.append(String.format("%d\t", col));
			}

			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}

}
