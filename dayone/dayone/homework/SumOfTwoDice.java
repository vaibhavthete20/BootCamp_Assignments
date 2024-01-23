package com.tut.dayone.homework;

public class SumOfTwoDice {

	public static void main(String[] args) {

//		Write a program SumOfTwoDice that prints the sum of two random integers
//		between 1 and 6 (such as you might get when rolling dice).
		
		System.out.println("printing the sumof two random integers ");
		
		double a =Math.floor(Math.random()*6 +1);
		double b =Math.floor(Math.random()*6 +1);
		
		System.out.println("Random integer a "+a);
		System.out.println("Random integer b "+b);
		System.out.println(" Addition of two random integer is "+ (a+b));
	}

}
