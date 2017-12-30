package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height = 5; //height of wallpaper
		int width;
		

		System.out.println("Please input width of wallpaper:");
		width = sc.nextInt();

		for (int i = 1; i <= height; i += 1) {
			for (int j = 1; j <= width; j += 1) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
