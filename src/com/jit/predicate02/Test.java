package com.jit.predicate02;

/*predicate to check the length of string is greater than 3 or not*/
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()>3;
		System.out.println(p.test("Jitendra"));
		System.out.println(p.test("JK"));
	}
}
