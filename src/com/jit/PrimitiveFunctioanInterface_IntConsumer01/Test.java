package com.jit.PrimitiveFunctioanInterface_IntConsumer01;

/*Demo Program for IntConsumer:*/
import java.util.function.*;

class Test {
	public static void main(String[] args) {
		IntConsumer c = i -> System.out.println("The Square of i:" + (i * i));
		c.accept(10);
	}
}