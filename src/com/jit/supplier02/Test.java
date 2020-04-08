/* Program  to get Random Name Using Supplier:*/
package com.jit.supplier02;

import java.util.function.Supplier;

class Test {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}