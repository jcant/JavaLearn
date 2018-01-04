package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		int d1 = 0;
		int d2 = 0;
		int maxPalindrome = 0;

		// isPalindrome(228515822);

		for (int i = 100; i < 1000; i += 1) {
			for (int j = i; j < 1000; j += 1) {
				if (isPalindrome(i * j)) {
					if ((i * j) > maxPalindrome) {
						d1 = i;
						d2 = j;
						maxPalindrome = i * j;
					}
					// System.out.println("found one: " + i + "*" + j + "=" + i*j);
				}
			}
		}

		System.out.println("Max palindrome was found: " + d1 + " * " + d2 + " = " + maxPalindrome);

	}

	static boolean isPalindrome(int x) {
		boolean end = false;
		int rank = 0;

		while (!end) {
			if (Math.pow(10, rank) > x) {
				end = true;
			} else {
				rank += 1;
			}
		}

		int[] digits = new int[rank];
		boolean result = true;

		for (int i = 1; i <= rank; i += 1) {
			digits[rank - i] = ((int) x % (int) Math.pow(10, i) / (int) Math.pow(10, i - 1));
		}

		for (int i = 0; i < digits.length / 2; i += 1) {
			if (digits[i] != digits[digits.length - i - 1]) {
				result = false;
				break;
			}
		}

		return result;
	}

}
