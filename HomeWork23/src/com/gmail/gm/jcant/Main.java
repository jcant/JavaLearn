package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input circle radius: ");

		double r = sc.nextDouble();

		double length = 2 * Math.PI * r;

		System.out.println("Circle length is: " + length);

		sc.close();

	}

}
