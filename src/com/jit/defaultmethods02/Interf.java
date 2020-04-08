package com.jit.defaultmethods02;

public interface Interf {
	default void m1() {
		System.out.println("Default method");
	}
}
