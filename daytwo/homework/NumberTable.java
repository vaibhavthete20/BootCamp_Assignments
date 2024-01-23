package com.tut.daytwo.homework;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to form a table ");
		int number=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(number+" * "+i +" = "+number*i );
		}
	}

}
