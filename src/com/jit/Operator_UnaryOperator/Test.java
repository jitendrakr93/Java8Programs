package com.jit.Operator_UnaryOperator;

// If input and output are same type then we should go for UnaryOperator
// It is child of Function<T,T>
import java.util.function.*;

class Test {
	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
	}
}