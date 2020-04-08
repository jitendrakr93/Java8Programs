package com.jit.predicate08;

/*Program to check whether software engineer in allowed into pub or not*/
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		SoftwareEngineer[] list = {
				new SoftwareEngineer("Sunil", 25, true),
				new SoftwareEngineer("Sayan", 26, true),
				new SoftwareEngineer("Subbu", 28, false),
				new SoftwareEngineer("Ravi", 17, true),
		};

		Predicate<SoftwareEngineer> sPredicate = s -> s.age >= 18 && s.isHavingGf == true;
		System.out.println("The allowed members into pub are : ");
		for(SoftwareEngineer se : list) {
			if(sPredicate.test(se)) {
				System.out.println(se);
			}
		}
	}

}
