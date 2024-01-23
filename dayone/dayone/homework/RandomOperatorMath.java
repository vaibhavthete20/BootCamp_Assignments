package com.tut.dayone.homework;

import java.util.Scanner;

public class RandomOperatorMath {

	public static void main(String[] args) {

//		RandomOperatorMath Write a program that generates two random integers
//		between 1 and 10 and a random arithmetic operator (+, -, *, or /), then prints the
//		equation and the result of the operation.

		Scanner sc = new Scanner(System.in);
		int a = (int) Math.floor(Math.random() * 10 + 1);
		int b = (int) Math.floor(Math.random() * 10 + 1);

		char operator = generateOperator();
        System.out.println("Generated Equation: " + a + " " + operator + " " + b);
		
		System.out.println("0.Addition\n 1.Subtraction\n 2.multiply\n 4.division\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 0:
			System.out.println("Addition operation");
			System.out.println(a+b);
			break;
		case 1:
			System.out.println("Subtraction operation");
			System.out.println(a-b);
			break;
		case 2:
			System.out.println("multiply operation");
			System.out.println(a*b);
			break;
		case 3:
			if(b!=0) {
				System.out.println(a/b);
				break;
			}
			else {
				System.out.println("cannot divide by zero,plz enter a non zero number for operation");
			}
			break;
		default:
			System.out.println("Invalid choice ");
			break;
		}

	}

	private static char generateOperator() {
		int randomOp = (int) (Math.random() * 4);
		System.out.println(randomOp);
		switch (randomOp) {
		case 0:
			return '+';
		case 1:
			return '-';
		case 2:
			return '*';
		case 3:
			return '/';
		default:
			throw new IllegalStateException();
		}
	}

}
