package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		double a;
		double b;
		double c;
		
		System.out.println("Please enter first side of the triangle:");
		a = sc.nextDouble();
		System.out.println("Please enter second side of the triangle:");
		b = sc.nextDouble();
		System.out.println("Please enter third side of the triangle:");
		c = sc.nextDouble();
		
		if ( ((a+b)>c) && ((b+c)>a) && ((a+c)>b) ) {
			
			answer = "Triangle is exist";
			
		}else {
			
			answer = "Triangle is NOT exist!";
			
		}
		
		System.out.println(answer);
		
		sc.close();

	}

}
