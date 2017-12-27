package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input number (5 digits max!)");

		int number = sc.nextInt();

		System.out.println("result:");
		System.out.println(number / 10000);
		System.out.println(number % 10000 / 1000);
		System.out.println(number % 1000 / 100);
		System.out.println(number % 100 / 10);
		System.out.println(number % 10);
		
		sc.close();

	}

}
