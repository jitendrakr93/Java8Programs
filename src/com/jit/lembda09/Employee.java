package com.jit.lembda09;

public class Employee {
	int eNo;
	String eName;
	public Employee(int eNo, String eName) {
		this.eNo = eNo;
		this.eName = eName;
	}
	@Override
	public String toString() {
		return  eNo + " : " + eName;
	}
	

}
