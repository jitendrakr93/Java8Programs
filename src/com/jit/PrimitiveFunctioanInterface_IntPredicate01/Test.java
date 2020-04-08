package com.jit.PrimitiveFunctioanInterface_IntPredicate01;

import java.util.function.IntPredicate;

/*Demo program for IntPredicate*/
public class Test {

	public static void main(String[] args) {
		int x[] = {10,3,6,70,4,2,7,5,40};
		IntPredicate intPredicate = i -> i % 2 == 0;
		for(int i : x) {
			if(intPredicate.test(i)) {
				System.out.println(i);
			}
		}

	}

}
