package com.jit.bifunction01;
/*Take tw integer and print its multiplication*/
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (i1,i2) -> i1*i2;
		System.out.println(biFunction.apply(2, 3));
		System.out.println(biFunction.apply(10, 20));
	}

}
