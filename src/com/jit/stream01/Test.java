package com.jit.stream01;
/*To collect only even numbers from the array list*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l1.add(i);
		}
		List<Integer> l2 = l1.stream().filter(I -> I%2 ==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
