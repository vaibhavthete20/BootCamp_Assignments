package com.tut.dayone;

import java.util.Scanner;

public class InputPrecedence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter c :");
		int c = sc.nextInt();
		
		int res1=a+b/c;
		System.out.println(res1);
	}

}
