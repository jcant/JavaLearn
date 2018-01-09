package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String binNumber;

		System.out.println("Please input binary number: ");
		binNumber = sc.nextLine();
		sc.close();

		int result = binToDecimal(stringToBinary(binNumber));

		System.out.println("Decimal: " + result);
		
		int x = (int)1000b0;

	}

	static int[] stringToBinary(String str) {
		char ch;
		int[] array = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == '1') {
				array[i] = 1;
			} else if (ch == '0') {
				array[i] = 0;
			} else {
				array = new int[0];
				return array;
			}

		}
		
		return array;
	}

	static int binToDecimal(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += Math.pow(2, arr.length-i-1)*arr[i];
		}
		return result;
		
	}

}
