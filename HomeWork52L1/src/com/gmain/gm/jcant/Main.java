package com.gmain.gm.jcant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize;
		int[] array;

		System.out.println("Input array size:");
		arraySize = sc.nextInt();

		array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array value: array[" + i + "]");
			array[i] = sc.nextInt();
		}

		System.out.println("Your array:");
		System.out.println(Arrays.toString(array));

	}

}
