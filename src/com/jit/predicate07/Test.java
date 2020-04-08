package com.jit.predicate07;
/*User Authentication By Using Predicate*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test{

	public static void main(String[] args) {
		
		Predicate<User> p = u -> u.userName.equals("durga") && u.pwd.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String userName= sc.next();
		System.out.println("Enter Password");
		String pwd = sc.next();
		User user = new User(userName, pwd);
		if(p.test(user)) {
			System.out.println("Valid user and can avail all services");
		}else {
			System.out.println("Invalid user you can not avail services");
		}
	}
}
