package com.tut.daytwo.homework;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {

//		2. Day of the Week Write a program that takes a number from 1 to 7 as input and
//		outputs the corresponding day of the week (e.g., 1 - Sunday, 2 - Monday, ...).
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sunday\n 2.monday\n 3.tuesday\n 4.wednesday\n 5.thursday\n 6.friday\n 7.saturday");
		
		System.out.println("Enter a number between 1 and 7");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;

		default:
			System.out.println("Enter a valid choice???");
			break;
		}
	}

}
