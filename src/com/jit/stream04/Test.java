package com.jit.stream04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Jitendra");
		l1.add("Kumar");
		l1.add("Singh");
		System.out.println(l1);

		Long count = l1.stream().filter(s -> s.length() > 20).count();
		System.out.println(count);

		Long counts = l1.stream().count();
		System.out.println(counts);

	}

}
