package com.tut.daytwo.homework;

import java.util.Arrays;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

//		4. Odd or Even Design a program that determines if a given integer is odd or even
//		using an if else statement.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value ");
		
		int number=sc.nextInt();
	
		String res = (number%2==0) ? "even" :"odd";
		System.out.println(res);
		
	}

}
