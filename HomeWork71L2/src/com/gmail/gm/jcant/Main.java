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

		System.out.println("Please enter some date: ");
		sDate = sc.nextLine();
		sc.close();

		int[] sysDate = splitDate(new Date(), false);
		int[] userDate = splitDate(parseDate(sDate), true);

		String sp = getSeparator(sDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd" + sp + "MM" + sp + "yyyy");

		if (userDate[0] != 0) {
			System.out.println("System date: " + sdf.format(new Date()));
			System.out.println("Your   date: " + sdf.format(parseDate(sDate)));
			System.out.println(getDifferenceAnswer(sysDate, userDate));
		} else {
			System.out.println("An error has occurred!");
		}

	}

	static Date parseDate(String sDate) {
		Date result = new Date();
		String separator = getSeparator(sDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd" + separator + "MM" + separator + "yyyy");
		try {
			result = sdf.parse(sDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	static String getSeparator(String date) {
		String separator = "";
		char[] variants = { ' ', '-', '/', '_', '\\', '.', '.', ':' };
		for (char c : variants) {
			if (date.indexOf(c) != -1) {
				return separator + c;
			}
		}
		return separator;
	}

	static int[] splitDate(Date date, boolean control) {
		int[] result = new int[3];
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);

		if ((control) && (cl.get(Calendar.MILLISECOND) != 0)) {
			return result;
		}

		result[0] = cl.get(Calendar.DAY_OF_MONTH);
		result[1] = cl.get(Calendar.MONTH);
		result[2] = cl.get(Calendar.YEAR);

		return result;
	}

	static String getDifferenceAnswer(int[] date1, int[] date2) {
		StringBuilder sb = new StringBuilder();

		if (date1[0] != date2[0]) {
			sb.append("Difference in days");
			sb.append(System.getProperty("line.separator"));
		}
		if (date1[1] != date2[1]) {
			sb.append("Difference in months");
			sb.append(System.getProperty("line.separator"));
		}
		if (date1[2] != date2[2]) {
			sb.append("Difference in years");
			sb.append(System.getProperty("line.separator"));
		}
		if ((date1[0] == date2[0]) && (date1[1] == date2[1]) && (date1[2] == date2[2])) {
			sb.append("It is no difference in dates");
		}

		return sb.toString();
	}

}
