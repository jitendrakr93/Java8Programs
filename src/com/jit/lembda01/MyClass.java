/*Invoking Lambda Expression By Using Functional Interface Example 1*/
package com.jit.lembda01;

public class MyClass {

	public static void main(String[] args) {
		Interf i= () ->System.out.println("m1() method implementation");
		i.m1();
	}

}
