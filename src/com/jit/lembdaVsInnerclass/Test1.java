package com.jit.lembdaVsInnerclass;


public class Test1 {
	
	int x = 888;
	public void m2() {
		Interf i = new Interf() {
			int x = 999;
			public void m1() {
				System.out.println(this.x);
			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m2();

	}

}
