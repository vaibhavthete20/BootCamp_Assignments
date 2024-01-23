package com.tut.daytwo.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleBySpecificNumber {

	public static void main(String[] args) {

//		Among the numbers between 1 to 30, find out the numbers which are divisible by
//		3. Create an array of these numbers and print the same.
		
		List<Integer>list=new ArrayList<Integer>();
		for(int i=1;i<=30;i++)
		{
			if(i%3==0) {
				list.add(i);
			}
		}
		System.out.println(list.toString());
		
		Integer[]array=list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(array));
	}

}
