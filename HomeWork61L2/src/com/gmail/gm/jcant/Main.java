package com.gmail.gm.jcant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr;
		int[] intArr;
		
		System.out.println("Please input a sequence of integer number (separated with comma):");
		String str = sc.nextLine();
		
		strArr = str.split(",");
		intArr = new int[strArr.length];
		
		for (int i=0;i<intArr.length; i+=1) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(intArr));
		
		if(isSequenceType1(intArr)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	static boolean isSequenceType1(int[] arr) {
		int base = arr[0];
		int d = arr[1] - base;
		
		boolean result = true;
		
		for(int i = 2; i<arr.length; i+=1) {
			if (arr[i]!=base+d*i)
			{
				result = false;
				break;
			}
		}
		
		return result;
	}

}
