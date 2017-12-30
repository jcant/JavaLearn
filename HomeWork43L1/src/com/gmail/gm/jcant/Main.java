package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		int basis = 5; // multiplication table basis

		System.out.println("Mulitplication table for " + basis + ":");

		for (int i = 1; i < 10; i += 1) {

			System.out.println("" + i + " * " + basis + " = " + (i * basis) + ";");

		}

	}

}
