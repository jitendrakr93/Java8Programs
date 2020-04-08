package com.jit.predicate01;
/*Program to check whether the given integer is greater than 10 or not*/
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		Predicate<Integer> p =i -> i>10;
		System.out.println(p.test(100));
		System.out.println(p.test(7));
		//System.out.println(p.test(true));
	}
}
