/*Invoking Lambda Expression By Using Functional Interface Example 2*/
package com.jit.lembda02;

public class MyClass {

	public static void main(String[] args) {
		Interf i = (a,b)->System.out.println("Addition value is : "+(a+b));
		i.add(10, 20);
	}

}
