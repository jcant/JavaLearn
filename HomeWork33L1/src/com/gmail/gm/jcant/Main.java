package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";

		int year;

		System.out.println("Please enter some Year:");
		year = sc.nextInt();

		if (year > 0) {

			if ((year % 400) == 0) {

				answer = "leap year";

			} else if ((year % 100) == 0) {

				answer = "not a leap year";

			} else if ((year % 4) == 0) {

				answer = "leap year";

			} else {

				answer = "not a leap year";
			}

		} else {

			answer = "Incorrect Year!";
		}

		System.out.println(answer);

		sc.close();

	}

}
