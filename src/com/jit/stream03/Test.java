package com.jit.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Jitendra");l1.add("Kumar");l1.add("Singh");
		System.out.println(l1);
		
		List<String> l2= l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
