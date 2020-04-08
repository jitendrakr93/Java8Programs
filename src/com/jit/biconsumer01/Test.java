package com.jit.biconsumer01;

import java.util.function.BiConsumer;

/*Take two String and print its concentation*/
public class Test {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (s1,s2) -> System.out.println(s1+s2);
		biConsumer.accept("Jitendra", "Kumar");
	}

}
