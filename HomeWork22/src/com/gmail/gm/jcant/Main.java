package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		// !!! The sides of the triangle must correspond the requirements:
		// - maximum side must be less than sum of two others
		// If not so the triangle does not exist

		double a = 24.5;
		double b = 48.89999;
		double c = 24.4;

		double p = (a + b + c) / 2.0;

		double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Triangle square = " + square);

	}

}
