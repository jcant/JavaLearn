package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double a1;
		double a2;
		double a3;
		double a4;
		double max;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number:");
		a1 = sc.nextDouble();

		System.out.println("Please enter second number:");
		a2 = sc.nextDouble();

		System.out.println("Please enter third number:");
		a3 = sc.nextDouble();

		System.out.println("Please enter fourth number:");
		a4 = sc.nextDouble();

		max = a1;

		if (max < a2) {
			max = a2;
		}

		if (max < a3) {
			max = a3;
		}

		if (max < a4) {
			max = a4;
		}

		System.out.println("Maximum number is " + max);

		sc.close();

	}

}
