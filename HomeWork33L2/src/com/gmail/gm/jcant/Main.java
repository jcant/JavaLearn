package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer;

		int n1;
		int n2;
		int n3;
		int n4;

		int summ1;
		int summ2;

		int number;

		System.out.println("Please input ticket number (4 digits): ");
		number = sc.nextInt();

		n1 = number / 1000;
		n2 = number % 1000 / 100;
		n3 = number % 100 / 10;
		n4 = number % 10;

		summ1 = n1 + n2;
		summ2 = n3 + n4;

		if (summ1 > 9) {
			summ1 = (1 + summ1 % 10);
		}

		if (summ2 > 9) {
			summ2 = (1 + summ2 % 10);
		}

		if (summ1 == summ2) {
			answer = "You have Lucky Ticket!";
		} else {
			answer = "Sorry, You have ordinaly ticket, try again soon...";
		}

		System.out.println(answer);

		sc.close();

	}

}
