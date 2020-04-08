package com.jit.predicate05;
/*Program to display names start with K */
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		String[] names = {"Sunny","Kajal","Mallika","Katrina","Kareena"};
		
		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		
		System.out.println("Names Strat WIth k are :");
		for(String s : names) {
			if(startsWithK.test(s))
				System.out.println(s);
		}
	}
}
