package com.jit.consumer01;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("Durgasoft");

	}

}
