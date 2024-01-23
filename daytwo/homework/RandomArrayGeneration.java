package com.tut.daytwo.homework;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArrayGeneration {

	public static void main(String[] args) {

//		8. Random Array Generation: Develop an array of random numbers between
//		100.0 to 500.0 where size of the array is an user input.
//		Size of the array input should be between 1 to 10. If the user input is not between
//		1 to 10, input will be rejected and the user will be asked to enter the number
//		again. This iteration can happen at max 3 times. If a user does not enter the
//		correct input in the given 3 times, exit the program with a message that “Array
//		Size entered is not correct”. If the input is correct print the array created .

		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter the array size ");
		int size = sc.nextInt();

		int counter = 0;
		int attempt = 2;

		while ((size <= 1 || size >= 10) && counter < 3)
		{
			System.out.println("Enter the correct input size between 1 to 10 " + attempt + " Attempt left");
			size = sc.nextInt();
			counter++;
			attempt--;
			System.out.println(counter);

		}

		if (counter == 3)
		{
			System.out.println("The program is sucessfully terminated.Array size is not correct");
			System.exit(0);
		}
		else
		{
			int[] randomArr = new int[size];

			for (int i = 0; i < size; i++) {

				int randomNumber = (int) ( Math.random() * 400 + 100);
				randomArr[i] = randomNumber;
			}
			System.out.println(Arrays.toString(randomArr));

		}
	}

}
