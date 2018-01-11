package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StringBuilder seq = new StringBuilder();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter sequence:");
		seq.append(sc.nextLine());
		sc.close();

		if (isNumber(seq)) {
			System.out.println(findPeriod(seq).toString());

		} else {
			System.out.println("An error has occurred!");
		}

	}

	static boolean isNumber(StringBuilder num) {

		if (num.length() == 0) {
			return false;
		}
		for (int i = 0; i < num.length(); i++) {
			try {
				Integer.parseInt(num.substring(i, i + 1));
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	static StringBuilder findPeriod(StringBuilder seq) {
		StringBuilder result = new StringBuilder();
		result.append(seq.charAt(0));
		int cnt = 0;

		for (int i = 1; i < seq.length(); i++) {

			if (seq.charAt(i) != result.charAt(cnt)) {
				result.append(seq.substring(result.length(), i + 1));
				cnt = 0;

			} else {
				cnt++;
				if (cnt >= result.length()) {
					cnt = 0;
				}
			}
		}

		return result;

	}

}
