package com.tut.daythree.homework;

import java.util.Arrays;

public class SecondMaxElement {

	public static void main(String[] args) {

		int [] arr = {23, 56, 34, 78, 89, 100, 100};
		
		int max=Arrays.stream(arr).max().getAsInt();
		int secondmax=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<max) {
				secondmax=arr[i];
			}
		}
		System.out.println("The second max element is "+secondmax);
	}

}
