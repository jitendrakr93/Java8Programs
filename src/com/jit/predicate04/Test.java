package com.jit.predicate04;

import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("The Numbers Greater Than 10");
		m1(p1,x);
		System.out.println("The Even Numbers are");
		m1(p2,x);
		System.out.println("The Number not greater then 10 and even are");
		m1(p1.negate().and(p2),x);
		System.out.println("The Number not greater then 10");
		m1(p1.negate(),x);
		System.out.println("The Number  greater then 10 or even are");
		m1(p1.or(p2),x);
	}
	
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1 : x) {
			if(p.test(x1))
				System.out.println(x1);
		}
	}
}
