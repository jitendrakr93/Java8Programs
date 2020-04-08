package com.jit.constructorrefenece_doubleconon01;

class Sample {
	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

interface Interf {
	public Sample get(String s);
}

class Test {
	public static void main(String[] args) {
		Interf f = s -> new Sample(s);
		f.get("From Lambda Expression");
		Interf f1 = Sample::new;
		f1.get("From Constructor Reference");
	}
}
/*In method and constructor references compulsory the argument types must be matched.*/