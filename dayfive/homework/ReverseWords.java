package com.tut.dayfive.homework;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {

//		4. Reverse words Write a function which reverses each word of a given string. Test
//		this from main where a sentence is taken as an user input.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String sentence = sc.nextLine();
		
		reverseEachWord(sentence);	
	}
	private static void reverseEachWord(String sentence) {
		String [] stringArr=sentence.split(" ");
		
		for(int i=stringArr.length-1;i>=0;i--)
		{
			System.out.print(stringArr[i]+" ");
		}
	}

}
