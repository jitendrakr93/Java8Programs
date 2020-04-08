package com.jit.function10;

import java.util.function.*;
import java.util.*;

class Test {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 5);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username = sc.next();

		System.out.println("Enter Password:");
		String pwd = sc.next();

		if (f1.andThen(f2).apply(username).equals("durga") && pwd.equals("java")) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}
	}
}