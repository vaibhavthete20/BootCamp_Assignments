package com.tut.dayfive.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number ");

//		int number = sc.nextInt();
		int result = toBinary(1101);   //13
		System.out.println("The given binary to decimal,the decimal number is  "+result);
	}

	private static int toBinary(int number) {
		String s =String.valueOf(number);
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			int bitValue = Character.getNumericValue(s.charAt(i));
            int positionValue = s.length() - 1 - i; // Calculate the position value (power of 2)
            int rrr=bitValue*(int) Math.pow(2, positionValue);
            sum=sum+rrr;
				
		}
		return sum;
	}

}
