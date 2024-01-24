package com.tut.daythree.homework;

import java.util.Arrays;

public class AcendingOrder {

	public static void main(String[] args) {

//		9) Java Program to sort the elements of an array in ascending order  here  i used selection sort algorithm
		
		int arr[]= {34,23,31,56,74,89,11};
		
		for(int i=0;i<arr.length;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
				
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
