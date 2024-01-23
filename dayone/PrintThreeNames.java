package com.tut.dayone;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name :");
		String name1 = sc.nextLine();
		System.out.println("enter second name :");
		String name2 = sc.nextLine();
		System.out.println("enter third name :");
		String name3 = sc.nextLine();
		
		System.out.println("Hi my friends are "+name3+" "+name2+" "+name1+".");
	}

}
