package com.jit.methodrefenece_doubleconon02;

interface Interf {
	public void m1(int i);
}

class Test {

	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {
		Interf f = i -> System.out.println("From Lambda Expression:" + i);
		f.m1(10);
		Test t = new Test();
		Interf i1 = t::m2;
		i1.m1(20);
	}
}
/*In the above example functional interface method m1() referring to Test class instance method m2().
The main advantage of method reference is we can use already existing code to implement functional interfaces (code reusability).*/