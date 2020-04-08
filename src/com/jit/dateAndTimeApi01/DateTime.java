package com.jit.dateAndTimeApi01;
/*program for to display System Date and time.*/
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
