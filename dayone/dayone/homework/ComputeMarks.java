package com.tut.dayone.homework;

import java.util.Scanner;

public class ComputeMarks {

	public static void main(String[] args) {

//		2. ComputeMarks Write a program which takes the student name, Physics,
//		Chemistry and Mathematics Marks of a student as input. For each subject, marks
//		are out of 100. Compute the total marks of that student, percentage in each
//		subject and total percentage.

		System.out.println("Enter a student name ");
		Scanner sc = new Scanner(System.in);
		String studentName = sc.nextLine();
		System.out.println("Enter a makrks of a subject ");
		System.out.println("Enter a physics marks");
		int physics = sc.nextInt();

		System.out.println("Enter a chem marks");
		int chcem = sc.nextInt();

		System.out.println("Enter a math marks");
		int math = sc.nextInt();

		int totalMarks = physics + chcem + math;
		System.out.println(
				"calculating the percentage of each subject/n 1.physics/n 2.chem/n 3.math/n 4.totalpercentage");

		while (true) {
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				int phypercentage = (physics * 100) / 100;
				System.out.println("The physics percentage are " + phypercentage);
				break;
			case 2:
				int chempercentage = (chcem * 100) / 100;
				System.out.println("The chem percentage are " + chempercentage);
				break;
			case 3:
				int mathpercentage = (math * 100) / 100;
				System.out.println("The math percentage are " + mathpercentage);
				break;
			case 4:
				int totalPercentage = (totalMarks * 100) / 300;
				System.out.println("The totalpercentage percentage are " + totalPercentage);
				break;
			case 5:
				System.exit(0);
				sc.close();
				System.out.println("The program is sucessfully terminated ");
				

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
