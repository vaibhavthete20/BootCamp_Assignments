package com.tut.daythree.homework;

public class ReverseOrder {

	public static void main(String[] args) {
//		6) Java Program to print the elements of an array in reverse order
		
		int [] arr =new int[] {12,45,67,89,43};
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
