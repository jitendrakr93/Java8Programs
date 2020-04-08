package com.jit.bifunction02;
/*Create Student Object By Taking rollNo and name*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		BiFunction<String, Integer, Student> biFunction = (s1, i1) -> new Student(s1, i1);
		studentList.add(biFunction.apply("Jitendra", 11));
		studentList.add(biFunction.apply("Kumar", 12));
		studentList.add(biFunction.apply("Singh", 13));
		studentList.add(biFunction.apply("Raushan", 14));
		
		for(Student s : studentList) {
			System.out.println(s.name+"\t"+s.rollNo);
		}

	}

}
