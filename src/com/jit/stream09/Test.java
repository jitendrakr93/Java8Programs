package com.jit.stream09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(15);
		l1.add(10);
		l1.add(5);
		l1.add(30);
		l1.add(25);
		l1.add(20);
		Integer[] ir = l1.stream().toArray(Integer[]::new);
		for (Integer i : ir) {
			System.out.println(i);
		}

	}

}
