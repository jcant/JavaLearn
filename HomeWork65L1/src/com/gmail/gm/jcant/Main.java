package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";

		System.out.println("Say something good...");
		str = sc.nextLine();

		System.out.println("You said " + countWords(str) + " words.");

	}

	static int countWords(String s) {

		int cnt = 0;
		s.trim();

		boolean wordStarted = false;

		for (int i = 0; i < s.length(); i += 1) {
			char current = s.charAt(i);

			if (isSeparator(current)) {
				wordStarted = false;
			} else if (!wordStarted) {
				cnt += 1;
				wordStarted = true;
			}
		}

		return cnt;
	}

	static boolean isSeparator(char ch) {
		char[] separators = new char[] { ' ', ';', '.', ',', '!', '?' };
		boolean result = false;

		for (char item : separators) {
			if (ch == item) {
				result = true;
				break;
			}
		}

		return result;
	}

}
