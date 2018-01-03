package com.gmail.gm.jcant;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int size = 15;
		int[] array1 = new int[size];
		int[] array2;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100);
		}

		array2 = Arrays.copyOfRange(array1, 0, size * 2);

		for (int i = size; i < array2.length; i++) {
			array2[i] = array2[i - size] * 2;
		}

		System.out.println("First array:");
		System.out.println(Arrays.toString(array1));

		System.out.println("Second array:");
		System.out.println(Arrays.toString(array2));
	}

}
