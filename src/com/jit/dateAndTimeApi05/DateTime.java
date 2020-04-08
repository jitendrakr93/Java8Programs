package com.jit.dateAndTimeApi05;

import java.time.LocalDateTime;
import java.time.Month;

/*We can represent a particular Date and Time by using LocalDateTime object as follows.*/

public class DateTime {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
		System.out.println(dt1);
		LocalDateTime dt2=LocalDateTime.of(1995,04,28,12,45);
		System.out.println(dt2);
		System.out.println("After six months:"+dt2.plusMonths(6));
		System.out.println("Before six months:"+dt2.minusMonths(6));
	}

}
