package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	// This solution will not work when triangle is a point (all coordinates equals
	// themselves)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";

		// Triangle points coordinates:
		double ax = 1;
		double ay = 1;

		double bx = 4;
		double by = 4;

		double cx = 6;
		double cy = 1;

		// Triangle sides to vectors:
		double vax = bx - ax;
		double vay = by - ay;

		double vbx = cx - bx;
		double vby = cy - by;

		double vcx = ax - cx;
		double vcy = ay - cy;

		// user point:
		double ux;
		double uy;

		System.out.println("Please input X:");
		ux = sc.nextDouble();
		System.out.println("Please input Y:");
		uy = sc.nextDouble();

		// vectors multiplication: (only Z, X and Y = 0)
		double resAz = vax * (uy - ay) - vay * (ux - ax);
		double resBz = vbx * (uy - by) - vby * (ux - bx);
		double resCz = vcx * (uy - cy) - vcy * (ux - cx);

		if (((resAz >= 0) && (resBz >= 0) && (resCz >= 0)) || ((resAz <= 0) && (resBz <= 0) && (resCz <= 0))) {

			answer = "Your point is IN triangle!";

		} else {

			answer = "Your point is OUT of triangle!";

		}

		System.out.println(answer);

		sc.close();

	}

}
