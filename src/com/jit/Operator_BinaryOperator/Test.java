package com.jit.Operator_BinaryOperator;

/*It is the child of BiFunction<T,T,T>
BinaryOperator<T>
 public T apply(T,T)*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		System.out.println(b.apply("durga", "software"));
	}
}