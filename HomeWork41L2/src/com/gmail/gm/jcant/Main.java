package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int height;

		System.out.println("Please input height of triangle:");
		height = sc.nextInt();

		int stars = height * height; // all stars in figure

		int i = 1;
		int cnt = 1;
		int caret = 1;
		int incValue = 1;

		while (i <= stars) {

			System.out.print("*");

			if (caret == i) {
				System.out.println();
				cnt = cnt + incValue;
				caret = caret + cnt;

				// When we reach max height of figure, change the direction
				if (cnt == height) {
					incValue = -1;
				}
			}

			i++;
		}

		sc.close();

	}

}
