package com.tut.dayone;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		int x1, x2, y1, y2;
		double distance=0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point ");
		x1 = sc.nextInt();
		System.out.println("Enter x2 point ");
		x2 = sc.nextInt();
		System.out.println("Enter y1 point ");
		y1 = sc.nextInt();
		System.out.println("Enter y2 point ");
		y2 = sc.nextInt();
	

		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(distance);
	}

}
