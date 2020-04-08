package com.jit.biconsumer02;

import java.util.ArrayList;
import java.util.function.BiConsumer;

/*Increament employee salary */
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		BiConsumer<Employee, Double> c = (e,d) -> e.salary = e.salary + d;
		
		for(Employee e : l) {
			c.accept(e, 500.0);
		}
		
		for(Employee e : l) {
			System.out.println(e.name+"\t"+e.salary);
		}
		
	}
	
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Bunny", 2000));
		l.add(new Employee("Jitendra", 45000));
		l.add(new Employee("Kumar", 60000));
	}

}
