package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";

		String[] triades = { "hundred", "thousands", "millions" };
		String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		// max money is 999999999.99 - 11 digits
		int[] ranks = new int[11];

		double moneyD;

		System.out.println("How much money do you have?");
		moneyD = sc.nextDouble();

		sc.close();

		if (moneyD > 999999999.99) {
			answer = "Your money is too big! Congratulations! :)";
		}

		else {

			// dollars
			for (int i = 0; i < 9; i++) {
				ranks[i] = ((int) moneyD % (int) Math.pow(10, 9 - i) / (int) Math.pow(10, 9 - i - 1));
			}

			ranks[9] = (int) ((moneyD * 10) % 10);
			ranks[10] = (int) ((moneyD * 100) % 10);

			for (int i = 0; i < 9; i += 3) {

				if (ranks[i] != 0) {
					answer += " " + digits[ranks[i]] + " " + triades[0];
					answer += " and";
				}
				if ((ranks[i + 1] != 0) || (ranks[i + 2] != 0)) {

					int tmp = 10 * ranks[i + 1] + ranks[i + 2];
					if (tmp < 20) {
						answer += " " + digits[tmp];
					} else if (ranks[i + 1] != 0) {
						answer += " " + tens[ranks[i + 1]];
						if (ranks[i + 2] != 0) {
							answer += " " + digits[ranks[i + 2]];
						}
					}
				}
				if (((ranks[i] != 0) || (ranks[i + 1] != 0) || (ranks[i + 2] != 0)) && (i < 6)) {
					answer += " " + triades[2 - i / 3] + "";
				}
			}

			if ((int) moneyD == 0) {
				answer += digits[0];
			}

			answer += " dollars";

			// cents
			if ((ranks[9] != 0) || (ranks[10] != 0)) {

				answer += " and";

				int tmp = 10 * ranks[9] + ranks[10];
				if (tmp < 20) {
					answer += " " + digits[tmp];
				} else if (ranks[9] != 0) {
					answer += " " + tens[ranks[9]];
					if (ranks[10] != 0) {
						answer += " " + digits[ranks[10]];
					}
				}

				answer += " cents";
			}

		}

		System.out.println();
		System.out.println(answer);

	}

}
