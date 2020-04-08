/*Sorting Elements of TreeSet with Lambda Expression*/
package com.jit.lembda07;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<>((a,b)->(a>b)?1:(a<b)?-1:0);
		t.add(2);
		t.add(0);
		t.add(5);
		t.add(1);
		t.add(3);
		t.add(100);
		System.out.println(t);
		
	}

}
