package com.tut.dayfour.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size = sc.nextInt();
		System.out.println("Enter the lower limit ");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter the upper limit ");
		int upperLimit = sc.nextInt();

		function1(size, lowerLimit, upperLimit);

	}

	private static void function1(int size, int lowerLimit, int upperLimit) {

		Random random = new Random();
		int[] randomArr = new int[size];
		List<Integer> prime = new ArrayList<Integer>();
		List<Integer> nonprime = new ArrayList<Integer>();

		for (int i = 0; i < randomArr.length; i++) {
			int randomNumber = random.nextInt(lowerLimit, upperLimit);
			randomArr[i] = randomNumber;

		}

		System.out.println(Arrays.toString(randomArr));

		for (int num : randomArr)
		{
		    boolean isPrime = true;
		    for (int i = 2; i <= Math.sqrt(num); i++)
		    {
		        if (num % i == 0)
		        {
		            isPrime = false;
		            break;
		        }
		    }
		    if (isPrime)
		    {
		        prime.add(num);
		    }
		    else
		    {
		        nonprime.add(num);
		    }
		}

		System.out.println(prime.toString());
		System.out.println(nonprime.toString());

	}

}
