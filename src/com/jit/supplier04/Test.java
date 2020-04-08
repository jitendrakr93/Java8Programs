/*Program  to supply Random Passwords Using Supplier:
      Rules:
      1. length should be 8 characters
      2. 2,4,6,8 places only digits
      3. 1,3,5,7 only Capital Uppercase characters,@,#,$
*/
package com.jit.supplier04;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));
			String pwd = "";
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + d.get();
				} else {
					pwd = pwd + c.get();
				}
			}
			return pwd;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}