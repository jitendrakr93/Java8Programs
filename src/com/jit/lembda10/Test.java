package com.jit.lembda10;

/*local variable referenced from lambda expression must be final or effectively final*/
public class Test {
	int x = 10;
	public void m2()
	{
		int  y = 20;
		Interf i = () -> {
			x =888;
			//y =999;
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
	}

}
