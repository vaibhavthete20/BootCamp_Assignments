package com.tut.daythree.homework;

public class SmallestElement {

	public static void main(String[] args) {

		int [] arr = {12,34,5678,90,34,8};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum element is "+ min);
	}

}
