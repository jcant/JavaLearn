package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";
		int size;

		System.out.println("Please input hourglass size: (only odd number!)");
		size = sc.nextInt();

		if (size % 2 == 0) {
			answer = "Your number is not odd!";
		} else {
			int bound1 = 1;
			int bound2 = size;

			for (int i = 1; i <= size; i += 1) {
				for (int j = 1; j <= size; j += 1) {
					if (bound1 <= bound2) {
						if ((j >= bound1) && (j <= bound2)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					} else {
						if ((j >= bound2) && (j <= bound1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
				bound1 += 1;
				bound2 -= 1;
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
