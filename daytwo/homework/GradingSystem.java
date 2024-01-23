package com.tut.daytwo.homework;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

//		3. Grading System Write a program that takes a student's numerical score as input
//		and outputs their corresponding letter grade (A, B, C, D, F) using the following
//		ranges: A (90-100), B (80-89), C (70-79), D (60-69), F (0-59).
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a score ");
		int score = sc.nextInt();

		if (score >= 100 && score <= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}

		else if (score >= 60) {
			System.out.println("D");
		}

		else if (score >= 0) {
			System.out.println("F");
		}
		else 
			System.out.println("Enter a valid score!!!");
	}
}
