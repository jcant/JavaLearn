package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String binNumber;

		System.out.println("Please input binary number (max - 63 chars): ");
		binNumber = sc.nextLine();
		sc.close();

		if (binNumber.length() > 63) {

			System.out.println("You entered too big number!");

		} else {

			System.out.println("Decimal: " + getBinary(binNumber));
		}

	}

	static long getBinary(String str) {
		char ch;
		int[] array = new int[str.length()];

		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(str.length() - 1 - i);
			if (ch == '1') {
				array[i] = 1;
			} else if (ch == '0') {
				array[i] = 0;
			} else {
				return 0;
			}

		}

		return binToDecimal(array);
	}

	static long binToDecimal(int[] arr) {
		long result = 0;
		for (int i = 0; i < arr.length; i++) {

			result += Math.pow(2, i) * arr[i];
		}

		return result;

	}

}
