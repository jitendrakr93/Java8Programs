/*Sorting Elements of TreeMap with Lambda Expression*/
package com.jit.lembda08;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<>((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
		m.put(100, "Durga");
		m.put(600, "Sunny");
		m.put(300, "Bunny");
		m.put(200, "Chinny");
		m.put(700, "Vinny");
		m.put(400, "Pinny");
		System.out.println(m);
	}

}
