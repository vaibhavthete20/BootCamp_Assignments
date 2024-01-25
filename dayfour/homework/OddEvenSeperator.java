package com.tut.dayfour.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeperator {
	
//	Odd-even separator: Develop a program to separate out odd numbers and
//	even numbers from an array and generate two new arrays of odd numbers and
//	even numbers. Also check in this array odd numbers are more or even numbers
//	are more. Consider Fibonacci series of 20 elements as input array
//	- Using the same function as above, get a fibonacci series of 20
//	- Create a function or method to check if a number is odd or even. This
//	function should take one number as input and return true or false
//	- Create two functions/methods which takes fibonacci series as input and
//	creates odd or even array and it should return the same
//	- Finds which numbers are more -odd or even and prints the same.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input size for fibonacee series ");
		int size = sc.nextInt();

		List<Integer> generated = generateSeries(size);
		System.out.println(generated.toString());
		
		function(generated);
		
//
		int[] arr = { 1, 3, 2, 4, 5, 6, 7, 8, 9 };

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
				count1++;
			} else {
				odd.add(arr[i]);
				count2++;
			}
		}

		System.out.println(even.toString());
		System.out.println(odd.toString());

		if (count1 > count2) {
			System.out.println("even numbers in the array are more ");
		} else {
			System.out.println("Odd numbers in the array are more  ");
		}
	}
	
	
	private static void function(List<Integer> generated) {

		List<Integer> evenArrFibo = new ArrayList<Integer>();
		List<Integer> oddArrFibo = new ArrayList<Integer>();
		
		for (Integer integer : generated) {
			if(integer%2==0) {
				evenArrFibo.add(integer);
			}
			else
				oddArrFibo.add(integer);
		}
		
		System.out.println("fibonacee series even elements "+evenArrFibo.toString());
		System.out.println("fibonacee series odd elements "+oddArrFibo.toString());
	}

	private static List<Integer> generateSeries(int size) {

		List<Integer> generated = new ArrayList<Integer>();
		int first = 0, second = 1;

		generated.add(first);
		generated.add(second);

		for (int i = 3; i <= size; i++) {
			int res = first + second;
			first = second;
			second = res;
			generated.add(res);
		}
		return generated;
	}
	
}
