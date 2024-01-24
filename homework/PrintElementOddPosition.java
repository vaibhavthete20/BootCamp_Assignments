package com.tut.daythree.homework;

public class PrintElementOddPosition {

	public static void main(String[] args) {
//		5) Java Program to print the elements of an array present on an Odd position

		int[] arr = new int[] { 12, 34, 77, 28, 43 };
		for (int i = 0; i < arr.length; i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
		}

	}

}
