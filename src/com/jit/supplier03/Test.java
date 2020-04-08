/*Program to supply 6-digit Random OTP Using Supplier*/
package com.jit.supplier03;

import java.util.function.*;
import java.util.*;

class Test {
	public static void main(String[] args) {
		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
	}
}