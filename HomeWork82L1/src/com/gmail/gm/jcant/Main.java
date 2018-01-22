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

		String str = arrayToString2(array);
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

	public static String arrayToString2(int[][] arr) {
		StringBuilder sb = new StringBuilder();

		// put array rows cnt:
		sb.append(arr.length);
		sb.append(System.lineSeparator());
		// put array cols cnt:
		sb.append(arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(System.lineSeparator());
				sb.append(String.format("%d %d %d", i, j, arr[i][j]));
			}
		}

		return sb.toString();
	}

}
