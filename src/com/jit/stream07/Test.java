package com.jit.stream07;

/*To collect only even numbers from the array list*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		int min = l1.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("minimum value is:" + min);
		int max = l1.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("maximum value is:" + max);
	}

}
