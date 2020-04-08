package com.jit.PrimitiveFunctioanInterface_IntFunction01;
/*Demo Program to find square of given integer by using IntFunction:*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(5));
	}
}