package com.jit.PrimitiveFunctioanInterface_IntToDoubleFunction01;

/*Demo Program to find square root of given integer by using Function:*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntToDoubleFunction f = i -> Math.sqrt(i);
		System.out.println(f.applyAsDouble(9));
	}
}