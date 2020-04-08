package com.jit.stream06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Jitendra");
		l1.add("Kumar");
		l1.add("Singh");
		l1.add("Abhinav");
		l1.add("Babloo");
		System.out.println(l1);

		List<String> list = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("according to default sorting order:"+list);
		
		List<String> lists=l1.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("according to customized sorting order:"+lists);

	}

}
