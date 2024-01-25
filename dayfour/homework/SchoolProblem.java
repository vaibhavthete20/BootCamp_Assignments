package com.tut.dayfour.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolProblem {
//	5. From a school 435 students appeared in class XII exam. School wants to find out
//	% of pass, % of first division (60% and above) and how many scored 90% and
//	above.
//	Find out average marks of first division students and average score of 2nd
//	division students (between 45% till 60%).
//	For generating marks, plan using random numbers between 1.0 to 100.0
//	One can modify the random generator function for floating point numbers.
	public static void main(String[] args) {

		int size=435;
		Scanner sc = new Scanner(System.in);
		System.out.println("There are total 435 students in the class ");
				
		randomGeneratorFunction(size);
	}
	
	private static void randomGeneratorFunction(int students) {
		
		int studentIgrade=0;
		int studentIIgrade=0;
		int totalMarkIgrade=0;
		int totalMarkIIgrade=0;


		List<Integer>marks=new ArrayList<Integer>();
		for(int i=0;i<students;i++)
		{
			int randomNumber=(int) (Math.random()*100);
			marks.add(randomNumber);
		}
		
		for (Integer mark : marks) {
			
			if(mark>=60 ) {
				totalMarkIgrade=totalMarkIgrade+mark; 
				studentIgrade++;
			}
			else if(mark>=45) {
				totalMarkIIgrade=totalMarkIIgrade+mark;
				 studentIIgrade++;
			}
		}
		System.out.println("Average marks of I division "+totalMarkIgrade/studentIgrade);
		System.out.println("Average marks of II division "+totalMarkIIgrade/studentIIgrade);
	}

}
