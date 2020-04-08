package com.jit.dateAndTimeApi03;

import java.time.LocalTime;

/*Once we get LocalTime object we can call the following methods on that object.*/

public class DateTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d", h, m, s, n);
	}

}
