package com.jit.defaultmethods01;

public interface Interf {
	default void m1() {
		System.out.println("Default method");
	}
}
