package com.jit.bipredicate01;
/*Check sum of two given integer is even or not*/
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i1,i2) -> (i1+i2) % 2 ==0;
		System.out.println(biPredicate.test(2, 3));
		System.out.println(biPredicate.test(10, 30));
	}

}
