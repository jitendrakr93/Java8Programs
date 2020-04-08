package com.jit.dateAndTimeApi02;

import java.time.LocalDate;

/*Once we get LocalDate object we can call the following methods on that object
 *  to retrieve Day,month and year values separately.*/

public class DateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day+"..."+month+"..."+year); 
		System.out.printf("\n%d-%d-%d",day,month,year);
	}

}
