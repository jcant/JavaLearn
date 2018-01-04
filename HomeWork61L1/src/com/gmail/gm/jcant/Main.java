package com.gmail.gm.jcant;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] someArray = new int[10];
		
		for (int i = 0; i < someArray.length; i += 1) {
			someArray[i] = (int) (100 - Math.random() * 200);
		}

		System.out.println("Array: " + Arrays.toString(someArray));
		System.out.println("Maximum is: " + findMax(someArray));

	}

	static int findMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i += 1) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

}
