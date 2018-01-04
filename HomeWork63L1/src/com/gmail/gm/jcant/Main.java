package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int width;
		int height;

		System.out.println("Please input width:");
		width = sc.nextInt();
		System.out.println("Please input height:");
		height = sc.nextInt();

		sc.close();

		printRectangle(height, width);

	}

	static void printRectangle(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {

				if ((i == 1) || (j == 1) || (i == height) || (j == width)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
