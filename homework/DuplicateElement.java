package com.tut.daythree.homework;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
//		8) Java Program to print the duplicate elements of an array
		
		int arr[]= {124,45,56,7,8,56,90,45};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
		//second way using set 
		
		HashSet<Integer>set= new HashSet<Integer>();
		HashSet<Integer>set2= new HashSet<Integer>();

		for (int integer : arr) {
			if(set.contains(integer)) {
				set2.add(integer);
			}
			else
			{
				set.add(integer);
			}
		}
		System.out.println("Duplicate elements are :"+set2.toString());
		System.out.println("Unique elements are    :   "+set.toString());
	}

}
