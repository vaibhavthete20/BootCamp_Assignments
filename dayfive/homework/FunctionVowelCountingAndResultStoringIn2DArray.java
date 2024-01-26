package com.tut.dayfive.homework;

import java.util.HashMap;
import java.util.Scanner;

public class FunctionVowelCountingAndResultStoringIn2DArray {

	public static void main(String[] args) {

//		Day #4
//		1. Function Vowel counting and result storing in 2 dimensional array: From a main
//		program get a sentence input from a user. Check how many vowels are there in that
//		sentence. Also check which vowel has come how many times. Store the result in a two
//		dimensional array, where char ‘a’ can be 0th index, ‘e’ can be 1st index and so on
//		Refactor the above logic to be a function where function takes a string as input argument
//		and returns a two dimensional array.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input sentences to check the vowels ");
		String sentence = sc.nextLine();

		int[][] vowelResult = countAndStoreVowels(sentence);

		displayResult(vowelResult);

	}

	private static int[][] countAndStoreVowels(String sentence) {

		int vowles = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : sentence.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowles++;
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}

		// creating a 2D array

		System.out.println(map.size());
		int[][] result = new int[map.size()][2];
		int index = 0;

		for (Character ch : map.keySet()) {
			result[index][0] = ch;
			result[index][1] = map.get(ch);
			index++;
		}

		System.out.println("Total vowels in the given sentence are " + vowles);

		return result;
	}

	private static void displayResult(int[][] result) {

		for (int i = 0; i < result.length; i++) {
			System.out.println((char) result[i][0] + ": " + result[i][1]);
		}
	}

}
