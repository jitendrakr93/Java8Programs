package com.jit.defaultmethods03;

public interface Right {
	default void m1() {
		System.out.println("Right Default method");
	}
}
