package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		int i = 13;
		double d = 43.298;
		String s = "Some test string";

		System.out.println(concat(s, i, d));

	}

	static String concat(String s, int i, double d) {
		double summ = d + i;
		return s + " " + summ;
	}

}
