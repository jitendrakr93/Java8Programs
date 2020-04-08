/*Sorting Elements of ArrayList with Lambda Expression*/
package com.jit.lembda06;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList();
		list.add(2);
		list.add(0);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(100);
		Collections.sort(list, (a,b)->(a>b)?1:(a<b)?-1:0);
		System.out.println(list);
		
	}

}
