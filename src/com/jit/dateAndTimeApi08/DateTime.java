package com.jit.dateAndTimeApi08;

import java.time.Year;

/*write a program to check the given year is leap year or not*/

public class DateTime {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Year y = Year.of(n);
		if (y.isLeap())
			System.out.printf("%d is Leap year", n);
		else
			System.out.printf("%d is not Leap year", n);
	}

}
