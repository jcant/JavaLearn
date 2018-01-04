package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System.out.println("3:" + Math.pow(8, 1.0 / 3.0));

		Scanner sc = new Scanner(System.in);
		String[] strArr;
		int[] intArr;

		System.out.println("Please input a sequence of integer number (separated with comma):");
		String str = sc.nextLine();

		sc.close();

		strArr = str.split(",");
		intArr = new int[strArr.length];

		for (int i = 0; i < intArr.length; i += 1) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}

		int seq1 = isSequenceType1(intArr);
		int seq2 = isSequenceType2(intArr);
		int seq3 = isSequenceType3(intArr);
		if (seq1 != -1) {
			System.out.println("Type1: x[n]=x[0]+koef*n; \t next=" + seq1);
		}
		if (seq2 != -1) {

			System.out.println("Type2: x[n]=x[n-1]*koef; \t next=" + seq2);
		}
		if (seq3 != -1) {

			System.out.println("Type3: x[n]=(n+1)^koef; \t next=" + seq3);
		}

		if ((seq1 == -1) && (seq2 == -1) && (seq3 == -1)) {
			System.out.println("There is no corresponding sequence");
		}

	}

	static int isSequenceType1(int[] arr) {
		if (arr.length < 3) {
			return -1;
		}

		int base = arr[0];
		int d = arr[1] - base;

		boolean result = true;

		for (int i = 2; i < arr.length; i += 1) {
			if (arr[i] != base + d * i) {
				result = false;
				break;
			}
		}

		if (result) {
			return (base + d * arr.length);
		} else {
			return -1;
		}

	}

	static int isSequenceType2(int[] arr) {

		if ((arr[0] == 0) || (arr.length < 2)) {
			return -1;
		}

		int koef = arr[1] / arr[0];
		boolean result = true;

		for (int i = 1; i < arr.length; i += 1) {
			if (arr[i] != arr[i - 1] * koef) {
				result = false;
				break;
			}
		}

		if (result) {
			return (arr[arr.length - 1] * koef);
		} else {
			return -1;
		}
	}

	static int isSequenceType3(int[] arr) {
		if (arr.length < 3) {
			return -1;
		}

		boolean result = true;

		int exp = findExp(2, arr[1]);
		if (exp != -1) {
			for (int i = 2; i < arr.length; i += 1) {
				if ((int) Math.pow(i + 1, exp) != arr[i]) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}

		if (result) {
			return (int) Math.pow(arr.length + 1, exp);
		} else {
			return -1;
		}
	}

	// try to find exponent of x witch gives xp (x^?=xp)
	// max exponent is 10, min = 2
	static int findExp(int x, int xp) {
		int result = -1;

		for (int i = 2; i <= 10; i += 1) {
			int tmp = 1;

			for (int j = 1; j <= i; j += 1) {
				tmp = tmp * x;
			}

			if (tmp == xp) {
				result = i;
				break;
			}

			if (tmp > xp) {
				break;
			}

		}

		return result;
	}

}
