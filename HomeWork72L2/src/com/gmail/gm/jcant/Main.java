package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int x;
		System.out.println("Please enter the 1st number: ");
		n = sc.nextInt();
		System.out.println("Please enter the 2nd number: ");
		m = sc.nextInt();
		sc.close();

		x = n ^ m;

		System.out.println("Hamming distance: " + countBits(x));

	}

	static int countBits(int x) {
		int cnt = 0;

		while (x != 0) {
			if ((x & 1) == 1) {
				cnt++;
			}
			x = x >> 1;
		}

		return cnt;
	}

}
