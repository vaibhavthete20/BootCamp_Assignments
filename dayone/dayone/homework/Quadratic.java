package com.tut.dayone.homework;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

//		Write a program Quadratic to find the roots of the equation a*x*x + b*x + c. Since
//		the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be
//		found using a formula
//		a. delta = b*b - 4*a*c
//		b. Root 1 of x = (-b + sqrt(delta))/(2*a)
//		c. Root 2 of x = (-b - sqrt(delta))/(2*a)
//		d. Take a, b, and c as input values to find the roots of x.
		
		System.out.println("Enter the input values");
		
		Scanner sc = new Scanner(System.in);
		
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		double c =sc.nextDouble();

		findRoots(a, b, c);
		
	}
	public static void findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("No real roots exist for the given coefficients.");
        }
    }

}
