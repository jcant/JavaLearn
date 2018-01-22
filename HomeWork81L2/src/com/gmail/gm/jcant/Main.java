package com.gmail.gm.jcant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File file = new File("matrix.txt");

		int[][] array = getArray(file);

		System.out.println(arrayToString(array));

	}

	public static int[][] getArray(File f) {

		String[] lines = getArrayFromString(getFileString(f), System.lineSeparator());

		int[][] result = new int[lines.length][];

		for (int i = 0; i < lines.length; i++) {

			String[] row = getArrayFromString(lines[i], "\t");
			result[i] = new int[row.length];

			for (int j = 0; j < row.length; j++) {
				result[i][j] = Integer.parseInt(row[j]);
			}
		}

		return result;
	}

	public static String[] getArrayFromString(String str, String separator) {
		String[] arr = str.split(separator);
		return arr;
	}

	public static String getFileString(File f) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String txt = "";
			while ((txt = br.readLine()) != null) {
				sb.append(txt);
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return sb.toString();
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
