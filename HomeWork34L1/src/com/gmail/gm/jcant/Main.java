package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String answer = "";
		
		double a = 10.2;
		double b = 8.5;
		double c = 6.4;
		
		if ( ((a+b)>c) && ((b+c)>a) && ((a+c)>b) ) {
			
			answer = "Triangle is exist";
			
		}else {
			
			answer = "Triangle is NOT exist!";
			
		}
		
		System.out.println(answer);

	}

}
