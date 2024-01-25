package com.tut.dayfour.homework;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

//		1. Refactor the following Day #1 problems in few functions/method as follows:
//			- Delta computation
//			- Roots computation
//			Input & output should be done in main program
//
//			Write a program Quadratic to find the roots of the equation a*x*x + b*x + c. Since
//			the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be
//			found using a formula
//			a. delta = b*b - 4*a*c
//			b. Root 1 of x = (-b + sqrt(delta))/(2*a)
//			c. Root 2 of x = (-b - sqrt(delta))/(2*a)
//			d. Take a, b, and c as input values to find the roots of x.

//		Enter the input values
//		10
//		25
//		5
//		Root 1: -0.2192235935955848
//		Root 2: -2.280776406404415

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for a,b and c ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();

		double delta = delta(b, a, c);
		System.out.println("Value of delta is " + delta);

		roots(a, b, delta);
	}

	private static void roots(double a, double b, double delta) {
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b + Math.sqrt(delta)) / (2 * a);
		

		System.out.println(root1);
		System.out.println(root2);
	}

	private static double delta(double b, double a, double c) {

		double delta = b * b - 4 * a * c;
		return delta;
	}

}
