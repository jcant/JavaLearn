package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Input size of array:");
		size = sc.nextInt();

		int cycleCnt = 0;

		while (cycleCnt == 0) {
			System.out.println("Input degree of rotation(only: 90, 180, 270)");
			int tmp = sc.nextInt();
			if (tmp == 90) {
				cycleCnt = 1;
			} else if (tmp == 180) {
				cycleCnt = 2;
			} else if (tmp == 270) {
				cycleCnt = 3;
			}
		}

		sc.close();

		int[][] arr1 = new int[size][size];

		// fill array
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr1[i][j] = i + 1;
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		for (int repeats = 1; repeats <= cycleCnt; repeats++) {

			// 90 degrees array rotation
			for (int i = 0; i < size / 2; i++) {

				for (int j = i; j < size - i - 1; j++) {

					int tmp = arr1[i][j];

					int i1 = (size - 1) - j;
					int j1 = i;

					int iOld = i;
					int jOld = j;

					for (int k = 1; k < 4; k++) {

						arr1[iOld][jOld] = arr1[i1][j1];

						iOld = i1;
						jOld = j1;

						i1 = (size - 1) - jOld;
						j1 = iOld;
					}

					arr1[iOld][jOld] = tmp;

				}

			}
		}

		// print rotated array
		System.out.println();
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
