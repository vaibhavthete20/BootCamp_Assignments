package com.tut.daytwo.homework;

import java.util.Scanner;

public class GuessingTheNumber {

	public static void main(String[] args) {

//		10. GuessingTheNumber: Write a program GuessTheNumber that generates a
//		random number between 1 and 100, then prompts the user to guess the number
//		and provides hints like "Too high" or "To o low" until the correct number is
//		guessed.

		int randomNumber = (int) (Math.random() * 100 + 1);
		System.out.println(randomNumber);
		int attempt = 3;
		System.out.println("User now your turn to guess the number ");
		Scanner sc = new Scanner(System.in);
		int guessNumber = sc.nextInt();

		while (guessNumber != randomNumber && attempt != 0)
		{

			if (guessNumber > randomNumber)
			{
				System.out.println("TO HIGH");
				guessNumber = sc.nextInt();

			} 
			else if (guessNumber < randomNumber)
			{
				System.out.println("TO LOW");
				
				System.out.println("You Have left " + attempt + " try to guess the correct number ");
				attempt--;
				guessNumber = sc.nextInt();
			} 		
	
		}
		
		if(guessNumber==randomNumber) {
			System.out.println("Congratulation,You guess the correct number ");
		}
		else {
			System.out.println("better luck next time");
		}

	}

}
