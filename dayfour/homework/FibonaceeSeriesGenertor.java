package com.tut.dayfour.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonaceeSeriesGenertor {

	public static void main(String[] args) {
//		Fibonacci series generator and print every 5 numbers in a line: develop a
//		program which takes size (n) of series as input, generates fibonacci series as per
//		input.
//		- Create a function/method which takes size as input argument and returns
//		generated series
//		- Create another function/ method which takes generated series as input
//		argument and prints every five elements in one line separated by comma
//		and then goes to next line
//		Test this program with input as 10, 3 , 12
//		Eg with size as 10
//		0, 1, 1, 2, 3
//		5, 8, 13, 21, 34
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input size for fibonacee series ");
		int size=sc.nextInt();	
		
		List<Integer>generated=generateSeries(size);
		fiveElementEachLine(generated);
		System.out.println(generated.toString());
	}

	private static void fiveElementEachLine(List<Integer> generated) {

		   for (int i = 0; i < generated.size(); i++) {
		        System.out.print(generated.get(i) + ",");
		        if ((i + 1) % 5 == 0) {
		            System.out.println(); 
		        }
		    }
		    System.out.println(); 
	}

	private static List<Integer> generateSeries(int size) {
		
		List<Integer>generated=new ArrayList<Integer>();
		int first=0,second =1;
		
		generated.add(first);
		generated.add(second);
		
		for(int i=3;i<=size;i++)
		{
			int res=first+second;
			first=second;
			second=res;
			generated.add(res);
		}
		return generated;
	}

}
