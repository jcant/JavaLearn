package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int cnt = 0;

		for (int value : array) {
			if ((value % 2) != 0) {
				cnt += 1;
			}
		}

		System.out.println("Number of odd numbers is " + cnt);

	}

}
