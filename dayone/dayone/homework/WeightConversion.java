package com.tut.dayone.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightConversion {

	public static void main(String[] args) {
//      Weight Conversion In some UK shops grocery items sold are weighed in pounds.
//		Plan developing a program which converts the item weight in KG.
//		Where 1 Pound = 453.592 gm
//		Test this with entering different input in pounds and print the weight in KG
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds ");

		double pound=sc.nextDouble();

		while(true)
		{
			try 
			{
				if(pound<0) {
					throw new InputMismatchException();
				}
				else
				{
					double res=(pound*453.592)/1000;
					System.out.println("The Result in KG are "+res);
					break;
				}
			} catch (InputMismatchException e)
			{
				System.out.println("Invalid input ,plz enter a valid value ");
				pound=sc.nextDouble();
			}
	
		}
		

	}

}
