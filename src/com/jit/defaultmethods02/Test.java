package com.jit.defaultmethods02;

public class Test implements Interf{
	@Override
    public void m1() {
    	System.out.println("My own Implementation");
    }
	public static void main(String[] args) {
		Test t =new Test();
		t.m1();
	}
}
