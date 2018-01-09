package com.gmail.gm.jcant;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date;
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		
		cal.add(Calendar.MONTH, -1);
		date = cal.getTime();
		
		System.out.println("Current date:   \t"+sdf.format(currentDate));
		System.out.println("One month before: \t"+sdf.format(date));
		
		System.out.println("Difference in milliseconds: "+(currentDate.getTime() - date.getTime()));

	}

}
