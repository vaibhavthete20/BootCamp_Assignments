package com.tut.dayone;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the type of Temperature conversion/n 1.farahenit to celcius/n 2.celsius to farahenit   :");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter a farahenit temperature ");
			double farhaneit=sc.nextDouble();
			double c = (farhaneit-32)*5/9;
			System.out.println(c);
			break;
			
		case 2:
			System.out.println("enter a celsius temperature ");
			double temp=sc.nextDouble();
			double f=(temp*9/5)+32;
			System.out.println(f);
			break;
		default:
			System.out.println("invalid choice,plz enter valid choice ");
			break;
		}
	}

}
