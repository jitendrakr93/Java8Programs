/*Sorting of our own class Object with lambda expression*/
package com.jit.lembda09;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(100, "Katrina"));
		l.add(new Employee(600, "Kareena"));
		l.add(new Employee(200, "Deepika"));
		l.add(new Employee(400, "Sunny"));
		l.add(new Employee(500, "AAlia"));
		l.add(new Employee(300, "Malliaka"));
		System.out.println("Before Sorting");
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.eNo<e2.eNo)?-1:(e1.eNo>e2.eNo)?1:0);
		System.out.println("After Sorting");
		System.out.println(l);
	}

}
