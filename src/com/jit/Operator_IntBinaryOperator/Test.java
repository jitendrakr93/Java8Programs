package com.jit.Operator_IntBinaryOperator;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntBinaryOperator b = (i1, i2) -> i1 + i2;
		System.out.println(b.applyAsInt(10, 20));
	}
}