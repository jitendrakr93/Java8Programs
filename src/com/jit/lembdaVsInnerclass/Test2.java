package com.jit.lembdaVsInnerclass;


public class Test2 {

	int x = 888;

	public void m2() {
		Interf i = () -> {
			int x = 999;
			System.out.println(this.x);

		};
		i.m1();
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m2();

	}

}
