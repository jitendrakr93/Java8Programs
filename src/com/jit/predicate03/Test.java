package com.jit.predicate03;
/*Program to check whether the given collection is impty or not*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		Predicate<Collection> p =  c -> c.isEmpty();
		
		ArrayList  a = new ArrayList<>();
		a.add("A");
		System.out.println(p.test(a));
	}
}
