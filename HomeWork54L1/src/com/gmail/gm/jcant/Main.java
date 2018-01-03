package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		int countB = 0;

		System.out.println("Please enter a string:");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				countB++;
			}
		}

		System.out.println("String have " + countB + " 'b'");
	}

}
