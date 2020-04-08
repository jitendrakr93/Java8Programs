package com.jit.dateAndTimeApi04;

import java.time.LocalDateTime;

/*If we want to represent both Date and Time then we should go for LocalDateTime object.*/

public class DateTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

}
