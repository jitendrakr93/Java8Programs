package com.jit.Operator_IntUnaryOperator01;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntUnaryOperator f = i -> i * i;
		System.out.println(f.applyAsInt(6));
	}
}