package com.tut.daytwo.homework;

import java.util.Arrays;

public class ArrayOfSquares {

	public static void main(String[] args) {
//		Generate an array of squares of numbers from 1 to 10.
		
		int [] arr=new int[10];
		int count=0;
		for(int i=1;count<10;i++) {
			arr[count]=i*i;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
