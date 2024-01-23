package com.tut.daytwo.homework;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArraySumNAvg {

	public static void main(String[] args) {

//		9. Write a program RandomArraySumNAvg that generates an array of random
//		integers (Integer numbers should be between 0 to100) of size 75 and
//		calculates the sum of its elements. Plan also to compute the average of the
//		same.Print the sum and average on the screen.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		
		int size=sc.nextInt();
		int[]arr=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			int randomNumber=(int)(Math.random()*100);
			sum=sum+randomNumber;
			arr[i]=randomNumber;
		}
		int avg=sum/size;
			
		System.out.println("Generated array : "+Arrays.toString(arr));
		System.out.println("sum of all elements are = "+ sum);
		System.out.println("average of elements are = "+ avg);
	}

}
