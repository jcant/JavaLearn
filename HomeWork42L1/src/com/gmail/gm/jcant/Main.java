package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		long result = 1;

		String answer;

		System.out.println("Please input number (4<number<16):");
		number = sc.nextInt();

		if ((number > 4) && (number < 16)) {
			for (int i = 1; i <= number; i += 1) {
				result *= i;
			}
			answer = "" + number + "!=" + result;
		} else {
			answer = "Please enter correct number!";
		}

		System.out.println(answer);

		sc.close();
	}

}
