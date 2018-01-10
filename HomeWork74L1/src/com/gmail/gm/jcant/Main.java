package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(getPiString(i + 2));
		}

	}

	static String getPiString(int precision) {

		return String.format("PI = %." + precision + "f", Math.PI);
	}
}
