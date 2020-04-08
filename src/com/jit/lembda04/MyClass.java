/*Invoking Lambda Expression By Using Functional Interface Example 4*/
package com.jit.lembda04;

public class MyClass {

	public static void main(String[] args) {
		Interf i =x->x*x;
		System.out.println("Square is : "+i.squareIt(10));
	}

}
