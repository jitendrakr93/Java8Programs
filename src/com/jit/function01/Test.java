package com.jit.function01;
/*function to find length of the given string*/
import java.util.function.Function;

class Test {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));
	}
}