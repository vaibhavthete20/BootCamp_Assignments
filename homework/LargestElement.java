package com.tut.daythree.homework;

public class LargestElement {

	public static void main(String[] args) {

		int [] arr = {12,34,5678,90,34};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element is "+ max);
	}

}
