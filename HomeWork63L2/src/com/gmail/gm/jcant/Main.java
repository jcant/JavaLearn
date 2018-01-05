package com.gmail.gm.jcant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array;
		int size;

		int[][] returnedRef;
		int[][] result;

		System.out.println("Please input array size:");
		size = sc.nextInt();
		sc.close();

		array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		System.out.println("Source array: " + Arrays.toString(array));
		System.out.println();

		returnedRef = getVariants(array);

//		//test checkRepeats() method:
//		for (int i = 0; i < returnedRef.length; i++) {
//
//			int val = (int)(Math.random()*7);
//			for (int j = 0; j < returnedRef[i].length; j++) {
//				returnedRef[i][j] = val;
//			}
//
//		}

		result = new int[returnedRef.length][returnedRef[0].length];

		System.out.println("Variants count: " + returnedRef.length);
		System.out.println("Repeats: " + checkRepeats(returnedRef));

		for (int i = 0; i < returnedRef.length; i++) {

			System.out.println(Arrays.toString(returnedRef[i]));

			for (int j = 0; j < returnedRef[0].length; j++) {
				result[i][j] = returnedRef[i][j];
			}
		}

	}

	static int[][] getVariants(int[] values) {

		int[][] selfResult;
		int[][] returnedRef;

		int remainingSize = values.length - 1;

		if (remainingSize > 0) {

			int[] remainingValues = new int[values.length - 1];

			for (int i = 1; i < values.length; i++) {
				remainingValues[i - 1] = values[i];
			}

			// get result from Recursion:
			returnedRef = getVariants(remainingValues);

			int returnedRows = returnedRef.length;

			selfResult = new int[returnedRows * values.length][values.length];

			// fill selfResult:
			int row = 0;
			for (int i = 0; i < values.length; i++) { // look over self element position

				for (int j = 0; j < returnedRows; j++) { // returned variants rows
					int retColCnt = 0;
					for (int k = 0; k < selfResult[row].length; k++) { // returned variants columns

						if (k == i) {
							selfResult[row][k] = values[0];
						} else {
							selfResult[row][k] = returnedRef[j][retColCnt];
							retColCnt++;
						}
					}

					row++;
				}
			}
		} else {
			selfResult = new int[1][1];
			selfResult[0][0] = values[0];
		}

		return selfResult;

	}

	static int checkRepeats(int[][] arr) {
		int repeats = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				boolean flag = true;

				for (int k = 0; k < arr[i].length; k++) {

					if (arr[i][k] != arr[j][k]) {
						flag = false;
					}
				}

				if (flag) {
					repeats++;
					System.out.println("***" + Arrays.toString(arr[i]) + " = " + Arrays.toString(arr[j]));
				}
			}
		}

		return repeats;
	}

}
