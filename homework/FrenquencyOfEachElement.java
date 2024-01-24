package com.tut.daythree.homework;

import java.util.HashMap;

public class FrenquencyOfEachElement {

	public static void main(String[] args) {
		
//		2) Java Program to find the frequency of each element in the array

		int [] arr = new int[] {12,34,11,34,56,67,22,12};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			System.out.println(+arr[i] + " "+count);
		}
		
		//second way by using hashmap
		
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map.toString());

	}

}
