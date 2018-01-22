package com.gmail.gm.jcant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File textFile = new File("sample.txt");

		StringBuilder strb = readFile(textFile);

		int[][] stats = sortAndPack(countChars(strb));

		for (int[] row : stats) {
			System.out.print("'" + (char) row[0] + "' - ");
			System.out.println(row[1]);
		}

	}

	public static StringBuilder readFile(File file) {
		StringBuilder sb = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String txt = "";
			while ((txt = reader.readLine()) != null) {
				sb.append(txt.toLowerCase());
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return sb;
	}

	public static int[][] sortAndPack(int[] arr) {
		int[][] result = new int[notNullLenght(arr)][2];
		int cnt = 0;

		boolean flag = true;
		while (flag) {
			int[] max = findAndDestroyMax(arr);
			if (max[1] != 0) {
				result[cnt][0] = max[0];
				result[cnt][1] = max[1];
				cnt++;
			} else {
				flag = false;
			}
		}

		return result;
	}

	public static int[] countChars(StringBuilder sb) {
		int[] result = new int[getMaxCharCode(sb) + 1];

		for (int i = 0; i < sb.length(); i++) {
			result[sb.codePointAt(i)]++;
		}

		return result;
	}

	public static int getMaxCharCode(StringBuilder sb) {
		int max = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (max < sb.codePointAt(i)) {
				max = sb.codePointAt(i);
			}
		}
		return max;
	}

	public static int notNullLenght(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i != 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] findAndDestroyMax(int[] arr) {
		int val = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > val) {
				val = arr[i];
				index = i;
			}
		}
		arr[index] = 0;
		return new int[] { index, val };
	}

}
