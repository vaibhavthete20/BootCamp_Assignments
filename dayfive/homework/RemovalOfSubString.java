package com.tut.dayfive.homework;

import java.util.Scanner;

public class RemovalOfSubString {

	public static void main(String[] args) {

//		Removal of a char or substring from a string: Write a function which removes a
//		character or a substring from a string. Test this from main where a sentence is
//		taken as an user input.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String toRemove=sc.nextLine();
		String remainingPart=removalOfSubString(str,toRemove);
		System.out.println(remainingPart);
	}

	private static String removalOfSubString(String str, String toRemove) {

		return str.replaceAll(toRemove, "*");
		
	}

}
