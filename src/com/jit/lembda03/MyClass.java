/*Invoking Lambda Expression By Using Functional Interface Example 3*/
package com.jit.lembda03;

public class MyClass {

	public static void main(String[] args) {
		Interf i =s->s.length();
		System.out.println(i.getLength("Jitendra"));
	}

}
