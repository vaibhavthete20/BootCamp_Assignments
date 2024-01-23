package com.tut.daytwo.homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

//		1. Write a LeapYear program that takes a year as input and outputs the Year is a
//		Leap Year or not a Leap Year.
//		The LeapYear program only works for year >= 1582, corresponding to a year in
//		the Gregorian calendar. So ensure to check for the same. Further the Leap Year
//		is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
//		not a Leap Year and 2000 is a Leap Year.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year :"); 
		int year=sc.nextInt();
		
		if(year>=1582)
		{
			if(year%100==0 && year%400==0 ) {
				System.out.println(year + " year is leap year");
			}
			else if(year%4==0&&year%100!=0) {
				System.out.println("year a leap year");
			}
			else
				System.out.println("NOT A LEAP YEAR");
		}
		else
		{
			System.out.println("Enter a correct year which is greater than 1582	 ");
		}
	}

}
