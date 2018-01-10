package com.gmail.gm.jcant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sDate = "";
		Calendar clCurrent = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dd = new Date();
		try {
			dd = sdf.parse("/2018");
		} catch (ParseException e) {
			System.out.println("Some Error!");
			e.printStackTrace();
		}

		Calendar cl = Calendar.getInstance();
		cl.setTime(dd);

		System.out.println(clCurrent);
		System.out.println(cl);

		System.out.println("Please enter some date: ");
		sDate = sc.nextLine();

	}

	static Date parseDate(String sDate) {
		Date result = new Date();
		String separator = getSeparator(sDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd"+separator+"MM"+separator+"yyyy");
		try {
			result = sdf.parse(sDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	static String getSeparator(String date) {
		String separator = "";
		char[] variants = { ' ', '-', '/', '_', '\\' };
		for (char c : variants) {
			if (date.indexOf(c) != -1) {
				return separator + c;
			}
		}
		return separator;
	}
	
	static String getDifference(Date comparedDate) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		Calendar clCompared = Calendar.getInstance();
		
		clCompared.setTime(comparedDate);
		
		if (clCompared.get(Calendar.MILLISECOND)!=0) {
			return "An error has occurred!";
		}
		
		Calendar clBase = Calendar.getInstance();
		clBase.setTime(new Date());
		
		sb.append("System date: "+ );
		
		
		return result;
	}

}
