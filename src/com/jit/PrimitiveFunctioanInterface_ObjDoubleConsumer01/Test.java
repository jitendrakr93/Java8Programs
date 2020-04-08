package com.jit.PrimitiveFunctioanInterface_ObjDoubleConsumer01;
/*Demo Program to increment employee Salary by using ObjDoubleConsumer:*/
import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

class Test {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		ObjDoubleConsumer<Employee> c = (e, d) -> e.salary = e.salary + d;
		for (Employee e : l) {
			c.accept(e, 500.0);
		}
		for (Employee e : l) {
			System.out.println("Employee Name:" + e.name);
			System.out.println("Employee Salary:" + e.salary);
			System.out.println();
		}

	}

	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}