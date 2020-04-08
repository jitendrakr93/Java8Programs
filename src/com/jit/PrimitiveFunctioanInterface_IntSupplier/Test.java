package com.jit.PrimitiveFunctioanInterface_IntSupplier;

/*Demo Program to generate 6 digit random OTP by using IntSupplier:*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntSupplier s = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println("The 6 digit OTP: " + otp);
	}
}