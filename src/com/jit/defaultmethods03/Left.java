package com.jit.defaultmethods03;

public interface Left {
	default void m1() {
		System.out.println("Left Default method");
	}
}
