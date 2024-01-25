package com.tut.dayfour.homework;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);
		System.out.println("Enter decimal number ");
		int decimal=sc.nextInt();
		StringBuilder builder = new StringBuilder();
		binary(decimal,builder);
		System.out.println(builder.toString());
	}

	
	private static void binary(int decimal,StringBuilder builder) 
	{
		int number = 0;
		if(decimal!=0) {
			 number=decimal%2;
			decimal=decimal/2;
			binary(decimal,builder);
			builder.append(number);

		}
		
	}

}
