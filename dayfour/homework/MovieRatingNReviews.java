package com.tut.dayfour.homework;

public class MovieRatingNReviews {

//	Movie rating n reviews-
//	3 reviewers reviewed 4 movies on a scale of 1 to 10. Their ratings of movies are
//	as follows
//	- Keep this data in a 2 dimensional array
//	- Create a function/method which takes this 2 dimensional array as input
//	argument and computes the average rating of the movie
	public static void main(String[] args) {

		int [] [] arr= {
				{4,6,2,5},
				{7,9,4,8},
				{6,9,3,7},
		};
		
		Average(arr);
		
	}

	private static void Average(int[][] arr) {
		int total=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				total=total+arr[i][j];
				count++;
			}
		}
		System.out.println(count);
		System.out.println("total average rating "+total/count);

	}

}
