package com.tut.dayone.homework;

import java.util.Scanner;

public class SpeedConversion {

	public static void main(String[] args) {

//		Speed Conversion Create a program that converts speed given in kilometers per
//		hour (km/h) to meters per second (m/s) or vice versa.
//		Use the conversion factor: m/s = km/h * 1000 / 3600
		
		System.out.println("Enter a speed in Km/hr ");
		Scanner sc = new Scanner(System.in);
		
		double speed = sc.nextDouble();
		
		double res=speed*1000/3600;
		System.out.println("result in m/s "  +res);
		
		
	}

}
