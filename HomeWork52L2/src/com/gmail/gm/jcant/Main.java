package com.gmail.gm.jcant;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[] { 7, 2, 9, 4 };

		// print source array
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}

		// print modified array
		System.out.println();
		System.out.println(Arrays.toString(array));

	}

}
