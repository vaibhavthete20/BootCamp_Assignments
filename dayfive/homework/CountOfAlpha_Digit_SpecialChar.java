package com.tut.dayfive.homework;

public class CountOfAlpha_Digit_SpecialChar {

	public static void main(String[] args) {

//		10. Count of alphabets, digits and special characters : Develop a program
//		which counts number of alphabets, digits and special characters in a given string
		
		
		String str="vaibhavthete./20@gmail.com";
		int alphaCount=0;
		int digitCount=0;
		int specialCount=0;
		for (char ch : str.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				alphaCount++;
			}
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
			else
				specialCount++;
		}
		System.out.println(alphaCount);
		System.out.println(digitCount);
		System.out.println(specialCount);
	}

}
