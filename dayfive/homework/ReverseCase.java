package com.tut.dayfive.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseCase {

	public static void main(String[] args) {

//		Reverse case: For the above sentence, develop a program to reverse the case of each
//		character in the given string. In other words, if a character has upper case , change to
//		lower and vice versa.
//		Refactor the code to have this functionality as function
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that you want to convert ");
		String sentence=sc.nextLine();
		
		changeCase(sentence);
	}

	private static void changeCase(String sentence) {
		
		StringBuilder builder = new StringBuilder();
		for (char ch : sentence.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				builder.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				builder.append(Character.toUpperCase(ch));
			}
			else {
				//if there is something like space or anything then it comes to these else block
				builder.append(ch);
			}
		}
		
		System.out.println(builder.toString());
	}

}
