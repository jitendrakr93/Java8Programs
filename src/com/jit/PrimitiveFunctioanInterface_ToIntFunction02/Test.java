package com.jit.PrimitiveFunctioanInterface_ToIntFunction02;

/*Demo Program to find length of the given String by using ToIntFunction:*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("durga"));
	}
}