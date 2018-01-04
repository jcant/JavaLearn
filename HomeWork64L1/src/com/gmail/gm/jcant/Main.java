package com.gmail.gm.jcant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i += 1) {
			array[i] = 100 - (int) (Math.random() * 100);
		}

		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("What number index do you want to find?");

		System.out.println("Index = " + findFirstIndex(array, sc.nextInt()));

		sc.close();

	}

	static int findFirstIndex(int[] arr, int number) {
		int index = -1;
		for (int i = 0; i < arr.length; i += 1) {
			if (number == arr[i]) {
				index = i;
				break;
			}
		}

		return index;
	}

}
