package com.gmail.gm.jcant;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] someArray = new int[10];

		for (int i = 0; i < someArray.length; i++) {
			someArray[i] = (int) (Math.random() * 100);
		}

		System.out.println("Standart method array print: \t" + Arrays.toString(someArray));
		System.out.println("Our method array print: \t" + toString(someArray));

	}

	static String toString(int[] arr) {

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (int i = 0; i < arr.length; i += 1) {
			sb.append(arr[i]);
			if (i != (arr.length - 1)) {
				sb.append(", ");
			}
		}

		sb.append("]");

		return sb.toString();
	}

}