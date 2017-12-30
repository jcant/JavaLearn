package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int width;
		int height;

		System.out.println("Please input height:");
		height = sc.nextInt();

		System.out.println("Please input width:");
		width = sc.nextInt();

		for (int i = 1; i <= height; i += 1) {

			for (int j = 1; j <= width; j += 1) {

				if ((i == 1) || (i == height)) {

					System.out.print("*");

				} else if ((j == 1) || (j == width)) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			System.out.println();
		}
		
		sc.close();

	}

}
