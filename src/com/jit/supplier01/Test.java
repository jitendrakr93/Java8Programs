/*Program to get System date by using Supplier*/
package com.jit.supplier01;

import java.util.Date;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

	}

}
