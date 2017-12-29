package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";

		double circleX = 0;
		double circleY = 0;
		double circleR = 4;

		double powR = circleR * circleR;

		double pointX;
		double pointY;

		System.out.println("Please input X:");
		pointX = sc.nextDouble();
		System.out.println("Please input Y:");
		pointY = sc.nextDouble();

		double deltaX = pointX - circleX;
		double deltaY = pointY - circleY;

		double pointR = deltaX * deltaX + deltaY * deltaY;

		if (pointR <= powR) {

			answer = "You hit the circle!";

		} else {

			answer = "You missed the circle!";

		}

		System.out.println(answer);

		sc.close();

	}

}
