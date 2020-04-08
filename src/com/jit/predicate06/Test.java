package com.jit.predicate06;
/*Remove null values and Empty String from the given list*/
import java.util.ArrayList;
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		String[] names = {"Durga","null",null,"Katrina","Kareena"};
		
		Predicate<String> p = s -> s != null && s.length() != 0;
		ArrayList<String> list = new ArrayList<>();
		
		for(String s : names) {
			if(p.test(s))
				list.add(s);
		}
		System.out.println("The List of valid Names : ");
		System.out.println(list);
	}
}
