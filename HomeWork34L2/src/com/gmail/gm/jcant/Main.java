package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer;

		int number;

		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;

		System.out.println("Please enter 6-digits number:");
		number = sc.nextInt();

		n1 = number / 100000;
		n2 = number % 100000 / 10000;
		n3 = number % 10000 / 1000;
		n4 = number % 1000 / 100;
		n5 = number % 100 / 10;
		n6 = number % 10;

		if (n1 == 0) {
			answer = "Your number less than 6 digits, please re-enter correct nubmer!";
		} else if ((n1 == n6) && (n2 == n5) && (n3 == n4)) {
			answer = "Your number is palindrome!";
		} else {
			answer = "Your number is NOT palindrome";
		}

		System.out.println(answer);

		sc.close();

	}

}
