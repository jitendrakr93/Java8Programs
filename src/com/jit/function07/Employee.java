package com.jit.function07;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}
}