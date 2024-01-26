package com.tut.dayfive.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that you want to convert ");
		String sentence=sc.nextLine();
		
		List<String>list=extractWords(sentence);
		System.out.println(list.toString());
	}

	private static List<String> extractWords(String sentence) {

		List<String>list=new ArrayList<String>();
		for (String s : sentence.split(" ")) {
			list.add(s);
		}
		return list;
	}
}
