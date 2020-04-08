package com.jit.methodrefenece_doubleconon01;

class Test {
	public static void m1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		Runnable r = Test::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
/*In the above example Runnable interface run() method referring to Test class static method m1().
Method reference to Instance method:*/